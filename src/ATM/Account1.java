package ATM;
import java.util.Scanner;

public class Account1 {
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;
    public  Account1() {
        dateCreated=new java.util.Date();
    }

    public Account1(int id, double balance) {
        this.id=id;
        this.balance=balance;
        dateCreated=new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance=balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate=annualInterestRate;
    }

    public java.util.Date getDateCreate() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate/12)/100;
    }

    public void withDraw(double money1) throws Exception{
        if(money1<0)
            throw new Exception("取款数不能为负数");
        balance=balance-money1;
    }

    public void deposit(double money2) throws Exception{
        if(money2<0)
            throw new Exception("取款数不能为负数");
        balance=balance+money2;
    }
}

class ATMMachine1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] id = new int[100];
        for (int i = 0; i < 100; i++) {
            id[i] = i;
        }

        System.out.println("Please enter the id: ");
        int i = input.nextInt();
        Account1 people = new Account1(id[i], 1000);
        System.out.println("Account opening time is: " + people.getDateCreate());
        System.out.println("The balance is: " + people.getBalance());
        people.setAnnualInterestRate(15);
        System.out.println("The interest rate is: " + people.getAnnualInterestRate());
        while (true) {
            System.out.println("\nMain menu");
            System.out.println("1:check balance" + "\n2:withdraw" + "\n3:deposit" + "\n4:exit");
            System.out.print("Enter a choice: ");
            int x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println("The balance is: " + people.getBalance());
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    int money1=0;
                    boolean flag=true;
                    while (flag) {
                        try {
                            money1 = input.nextInt();
                            flag=false;
                        } catch (Exception ex) {
                            System.out.println("输入错误");
                            System.out.print("请重新输入: ");
                            input.nextLine();
                        }
                    }
                    try {
                        if(money1<people.getBalance())
                            people.withDraw(money1);
                        else
                            System.out.println("Lack of balance");
                    }catch (Exception ex){
                        System.out.println(ex.getMessage());
                    }

                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    int money2=0;
                    boolean flag1=true;
                    while (flag1) {
                        try {
                            money2 = input.nextInt();
                            flag1=false;
                        } catch (Exception ex) {
                            System.out.println("输入错误");
                            System.out.print("请重新输入: ");
                            input.nextLine();
                        }
                    }
                    try {
                        if(money2<people.getBalance())
                            people.deposit(money2);
                        else
                            System.out.println("Lack of balance");
                    }catch (Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    break;
            }
            if (x == 4)
                break;
        }
    }
}
