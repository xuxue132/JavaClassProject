package day2.Homework2;

public class Exerclses6_16 {
    public static void main(String[] args){
        int year=2000;

        for(int i=0;i<20;i++) {
            System.out.println(year+" : "+getTotalNumberOfDay(year));
            year++;
        }
    }

    public static int getTotalNumberOfDay(int year){
        int total=0;

        //计算总天数
        for (int i=1;i<=12;i++){
            total=total+getTotalMonth(year,i);
        }
        return total;
    }

    public static int getTotalMonth(int year,int month){
        //判断月份的天数
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month==10 || month==12)
            return 31;

        if(month==4||month==6||month==9||month==11)
            return 30;

        if(month==2){
            if(year % 400 == 0 || (year % 4 ==0 && year % 100 !=0))
                return 29;
            else
                return 28;
        }
        return 0;
    }
}
