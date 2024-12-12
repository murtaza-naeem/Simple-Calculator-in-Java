import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("*****Calculator*****\n");
        System.out.print("Enter first number: ");
        double  num1 = input.nextDouble ();

        System.out.print("Enter second number: ");
        double  num2 = input.nextDouble ();

        
        System.out.println("\nEnter (+) for Addition");
        System.out.println("Enter (-) for Subtraction");
        System.out.println("Enter (*) for Multiplication");
        System.out.println("Enter (/) for Division");
        System.out.print("\nChoose an operation from above: ");

        char chooseOpertor = input.next().charAt(0);

        switch (chooseOpertor) {
            case '+':
                System.out.println("The Addition of "+num1+" and "+num2+" is: " + add(num1, num2));
                break;

            case '-':
                System.out.println("The Subtraction of "+num1+" and "+num2+" is: " + subtract(num1, num2));
                break;

            case '*':
                System.out.println("The Multiplication of "+num1+" and "+num2+" is: " + multiply(num1, num2));
                break;

            case '/':
                System.out.println("The Dividion of "+num1+" and "+num2+" is: " + divide(num1, num2));
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
    // Method for addition
    public static double add(double  num1, double  num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double subtract(double  num1, double  num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static double multiply(double  num1, double num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(double  num1, double  num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
    } 
}
