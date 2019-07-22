package ATM;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ATMMachine2 {
    public static void main(String[] args){
        navigation();
    }

    public static void navigation(){
        Scanner input=new Scanner(System.in);
        System.out.println("1:登陆");
        System.out.println("2:注册");
        System.out.println("3:退出");
        System.out.print("请输入指令:");

        while (true){
            switch (input.nextInt()){
                case 1: login();break;
                case 2:register();break;
                case 3: {
                    System.out.print("感谢使用");
                    System.exit(0);
                }break;
                default:System.out.print("请输入正确的指令:");
                    input.nextLine();
                }
            }
        }

        public static void login() {
            Scanner input=new Scanner(System.in);

            ArrayList<Account2> account2s=new ArrayList<>();

            try {
                account2s=getaccount(new File("account.dat"));
            }catch (Exception ex){
                System.out.println("账户无数据，请先注册: ");
               navigation();
            }

            System.out.print("请输入账户: ");
            while (true){
                if(input.hasNextInt()) {
                    int id = input.nextInt();

                    for (Account2 account2 : account2s) {
                        System.out.println(account2.getId());
                        if (account2.getId() == id) {
                            String password;

                            System.out.print("请输入密码: ");

                            password = input.nextLine();
                            if (account2.getPassword().equals(password)) {
                                System.out.println("欢迎您! " + account2.getName());
                                menu(account2);
                            } else {
                                System.out.print("密码错误，请重新输入: ");

                            }
                        }
                    }
                    System.out.print("账户不存在，请重新输入：");
                    input.nextLine();
                }
                else {
                    System.out.print("请输入正确的账户: ");
                    input.nextLine();
                }
            }
        }

        public static ArrayList<Account2> getaccount(File file)throws Exception{
            ObjectInputStream read=new ObjectInputStream(new FileInputStream(file));

            return (ArrayList<Account2>)read.readObject();
        }

        public static void register(){
            Scanner input=new Scanner(System.in);

            ArrayList<Account2> account2s=new ArrayList<>();

            try {
                account2s=getaccount(new File("account.dat"));
            } catch (Exception e) {
                e.printStackTrace();
            }

            Account2 account2=new Account2();
            System.out.print("账号: ");
            int id=input.nextInt();
            account2.setId(id);

            System.out.print("请输入名称: ");
            String name=input.next();
            account2.setName(name);

            System.out.print("请输入密码: ");
            String password;
            boolean flag=true;
            while (flag){
                try {
                    password=input.next();
                    account2.setPassword(password);
                    flag=false;
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.print("请输入新密码: ");
                    input.nextLine();
                }
            }
            System.out.print("请输入余额:");
            double balance = input.nextDouble();
            account2.setBalance(balance);

            System.out.print("请输入年利率:");
            double annualInterestRate = input.nextDouble();
            account2.setAnnualInterestRate(annualInterestRate);

            account2s.add(account2);
            try {
                try (ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("accounts.dat"))){
                    oos.writeObject(account2s);
                }
                System.out.println("注册成功\n");
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.println("注册失败\n");
            }
            finally {
                navigation();
            }
        }

        public static void menu(Account2 account2){
            Scanner input = new Scanner(System.in);
            Account2 people = new Account2();
            System.out.println("\nMain menu");
            System.out.println("1:check balance" + "\n2:withdraw" + "\n3:deposit" + "\n4:transaction"+"\n5:change password"+"\n6:exit");

            while (true) {
                System.out.print("Enter a choice: ");
                int x = input.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("The balance is: " + people.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        int money1 = input.nextInt();
                        while (money1%100!=0){
                            System.out.println("Please input again");
                            System.out.print("Enter an amount to withdraw: ");
                            money1 = input.nextInt();
                        }
                        if(money1%100==0 && money1<=people.getBalance()) {
                            people.WithDraw(money1);
                        }
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        int money2 = input.nextInt();
                        while (money2%100!=0){
                            System.out.println("Please input again");
                            System.out.print("Enter an amount to deposit: ");
                            money2= input.nextInt();
                        }
                        if(money2%100==0) {
                            people.deposit(money2);
                        }
                        break;
                    case 4:
                        System.out.println("交易记录:");
                        for (int i = 0; i < people.getTransation().size(); i++) {
                            System.out.println(people.getTransation().get(i).toString());
                        }
                        break;
                    case 5: {
                        while (true) {
                            System.out.print("请输入密码: ");
                            String password = input.nextLine();
                            if (password.equals(account2.getPassword())) {
                                System.out.print("请输入新密码: ");
                                String password2=input.nextLine();
                                System.out.print("请再次输入: ");
                                String password3=input.nextLine();
                                if(password2.equals(password3)){
                                    account2.setPassword(password2);
                                    break;
                                }
                            }
                            else
                                System.out.println("密码错误,重新输入");
                            input.nextLine();
                        }
                    }break;
                    case 6:break;
                }
                if (x == 6)
                    break;
            }
        }
}
