import java.util.Scanner;



public class Calc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Welcome to the simple calculator!");

        System.out.print("Enter the first number: ");

        double num1 = scanner.nextDouble();



        System.out.print("Enter the second number: ");

        double num2 = scanner.nextDouble();



        System.out.print("Choose an operator (+, -, *, /): ");

        char operation = scanner.next().charAt(0);



        double result;



        // Switch statement to determine which operation to perform

        switch (operation) {

            case '+':

                result = num1 + num2;

                break;

                case '-':

                result = num1 - num2;

                break;

                case '*':

                result = num1 * num2;

                break;

                case '/':

                if (num2 != 0) {

                    result = num1 / num2;

                } else {

                    System.out.println("Error: Division by zero is illegal.");

                    return;

                }

                break;

            default:

                System.err.println("Invalid operation, please use +, -, *, /.");

                return;

        }

        System.out.printf("Result: %.2f %c %.2f = %.2f/n", num1, operation, num2, result);

    }

}