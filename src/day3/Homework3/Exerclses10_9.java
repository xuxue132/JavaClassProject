package day3.Homework3;

import java.util.Scanner;

public class Exerclses10_9 {
    public static void main(String[] args){
        Course course1=new Course("Data Structures");

        course1.addStudent("Peter");
        course1.addStudent("Kim");
        course1.addStudent("Anne");
        course1.addStudent("xuxue");
        course1.addStudent("Tom");

        System.out.println("Number of students in course1: "
                +course1.getNumberOfStudents());
        String[] students=course1.getStudents();
        for(int i=0;i<course1.getNumberOfStudents();i++)
            System.out.print(students[i]+", ");

        System.out.print("\nPlease enter the name of student to be deleted: ");
        Scanner input=new Scanner(System.in);
        String student1=input.nextLine();

        //删除某个学生
        course1.dropStudents(student1);
        String[] newstudent=course1.getStudents();
        for(int i=0;i<course1.getNumberOfStudents();i++)
            System.out.print(newstudent[i]+", ");

    }

}

class Course{
    private String courseName;
    private String[] students;
    private static final int NUMBER=3;
    private int size=0;

    public Course(String courseName) {
        this(courseName,NUMBER);
    }

    public Course(String courseName, int capacity){
        this.courseName=courseName;
        students=new String[capacity];
    }

    public void addStudent(String student){
        if(size>=students.length){
            //数组扩列
            String[] newstugents=new String[students.length*2];
            System.arraycopy(students,0,newstugents,0,students.length);
            students=newstugents;
        }

        students[size]=student;
        size++;
    }
    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return size;
    }

    public void dropStudents(String student){
        for (int i = 0; i < size; i++){
            if (student.equals(students[i])){
                //删除指定学生
                for(int j=i;j<students.length-1;j++)
                    students[j] = students[j + 1];
            }
        }

        size--;
    }

    public void clear() {
        size = 0;
        students = new String[100];
    }
}