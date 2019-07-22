package day2.Homework2;

public class Exerclses6_9 {
    public static void main(String[] args){
        int foot=1;
        int meter=20;

        System.out.println("英尺"+"\t\t"+"米"+"\t\t\t"+"米"+"\t\t"+"英尺");
        System.out.println("------------------------------------------------------------");

        //输出表格
        for(int i=0;i<10;i++){
            System.out.println(foot+"\t\t"+footToMeter(foot)+"\t\t\t"+meter+"\t\t"+meterToFoot(meter));
            foot++;
            meter+=5;
        }
    }

    //转化英尺为米
    public static double footToMeter(double foot){
        return foot*0.305;
    }

    //转化米为英尺
    public static double meterToFoot(double meter){
        return meter*3.279;
    }
}