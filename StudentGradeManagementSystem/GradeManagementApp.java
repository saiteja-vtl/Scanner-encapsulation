package StudentGradeManagementSystem;
import java.util.Scanner;

public class GradeManagementApp{
    Student details=new Student();
    Scanner in=new Scanner(System.in);
    void addStudent(){
        System.out.println("Enter Student Id");
        details.setStudentID(in.nextLine());
        System.out.println("Enter Student Name");
        details.setStudentName(in.nextLine());
        System.out.println("Enter Student Grade");
        double grade = in.nextDouble();
        if (grade>=0 && grade<=100) {
            details.setGrade(grade);
        } else {
            System.out.println("Invalid input for grade. Please enter a number between 0 to 100.");
            details.setGrade(in.nextDouble());
        }
        System.out.println();
    }
    void displayStudentInfo(){
        System.out.println("The student Id is "+details.getStudentID());
        System.out.println("The student Name is "+details.getStudentName());
        System.out.println("The student Grade is "+details.getGrade());
    }

    public static void main(String[] args) {
        GradeManagementApp info=new GradeManagementApp();
        info.addStudent();
        info.displayStudentInfo();
    }
}
