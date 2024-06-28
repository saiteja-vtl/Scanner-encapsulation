import java.util.Scanner;

public class UserInput {
    Scanner in = new Scanner(System.in);
    private String name;
    private int age;
    private String color;

    public void collectUserData() {
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter your age");
        age = in.nextInt();
        System.out.println("Enter favourite color");
        color = in.next();
    }

    public void displayUserData() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Color : " + color);

    }

    public static void main(String[] args) {
        UserInput details=new UserInput();
        details.collectUserData();
        details.displayUserData();
    }
}
