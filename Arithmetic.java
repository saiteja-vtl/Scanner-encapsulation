import java.util.Scanner;

public class Arithmetic {
    int number1;
    int number2;
    double result;

    static void showMenu(){
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

     double performOperation(int choice){
        if (choice==1){
            result=number1+number2;
        }
        else if(choice==2){
             result=number1-number2;
        }
        else if(choice==3){
            result=number1*number2;
        }
        else if (choice == 4){
            if (number2 != 0) {
                result = (double) number1 / number2;
            } else {
                System.out.println("Error: Division by zero");
                result = Double.NaN;  // Not a Number
            }
        }
        else{
            System.out.println("invalid input");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Arithmetic op=new Arithmetic();
        System.out.println("Enter two numbers");
        int number1=in.nextInt();
        int number2=in.nextInt();

        Arithmetic.showMenu();

        System.out.println("Enter your Choice");
        int choice=in.nextInt();

        System.out.println(op.performOperation(choice));

    }
}
