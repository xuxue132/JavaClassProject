package day2.Bookcode2;

import java.util.Scanner;

public class Listing6_12 {
    public static void main(String [] arsg){
        Scanner input=new Scanner(System.in);

        //Enter the year and month
        System.out.print("Please enter the year and month ");
        int year=input.nextInt();
        int month=input.nextInt();

        printMonth(year,month);
    }

    public static void printMonth(int year,int month){

        //输出日历开头部分
        printTile(year,month);

        //输出日历部分
        printBody(year,month);
    }

    public static void printTile(int year,int month){
        //日历开头
        System.out.println("        "+getMonthName(month)+" "+year);
        System.out.println("------------------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month){
        String monthName="";

        //输出月份
        switch(month){
            case 1:monthName="january";break;
            case 2:monthName="February";break;
            case 3:monthName="March";break;
            case 4:monthName="April";break;
            case 5:monthName="May";break;
            case 6:monthName="June";break;
            case 7:monthName="July";break;
            case 8:monthName="August";break;
            case 9:monthName="September";break;
            case 10:monthName="October";break;
            case 11:monthName="November";break;
            case 12:monthName="December";break;
        }

        return monthName;
    }

    public static void printBody(int year,int month){
        //获取此个月第一天是星期几
        int startDay=getStartDay(year,month);

        int i=0;
        for(i=0;i<startDay;i++)
            System.out.print("    ");
        for(i=1;i<=getTotalMonth(year,month);i++){
            System.out.printf("%4d",i);
            if((i+startDay)%7==0){
                System.out.println();
            }
        }
    }

    public static int getStartDay(int year,int month){
        final int START_DAY_OF_JAP_1_1800=3;

        //获取此日期与1800年一月一日的相距总天数
        int TotalDays=getTotalNumberOfDay(year,month);

        //返回此日期第一天的星期
        return (TotalDays+START_DAY_OF_JAP_1_1800)%7;
    }

    public static int getTotalNumberOfDay(int year,int month){
        int total=0;

        //从1800年一月一日开始计算天数
        for (int i=1800;i<year;i++){
            //判断是否是闰年
            if( isLeapYear(i))
                total=total+366;
            else
                total=total+365;
        }

        //计算总天数
        for (int i=1;i<month;i++){
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
            if(isLeapYear(year) )
                return 29;
            else
                return 28;
        }
        return 0;
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 ==0 && year % 100 !=0);
    }
}
