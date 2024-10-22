import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initate scanner
        Scanner scanner = new Scanner(System.in);

        //get expression
        System.out.print("Enter mathematical expression: ");
        String expression = scanner.nextLine();

        //tools for computation
        int result = 0;
        int num1 = 0, num2 = 0;
        char operator = ' ';

        //account for limitations
        if (expression.length() > 3) {
            System.out.print("Sorry, not advanced enough to handle that yet.");
            System.exit(1);
        }

        //string to primitives data types
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) {
                int number = Character.getNumericValue(currentChar);

                if (num1 == 0) {
                    num1 = number; // First number
                } else {
                    num2 = number; // Second number
                }
            } else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                operator = currentChar; // Save the operator
            }
        }

        // Perform the operation based on the operator
        switch (operator) {
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
                    int remainder = num1 % num2;
                    System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + result +
                            " with a remainder of " + remainder);
                    return;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
            default:
                System.out.println("Unknown operator.");
                return;
        }

        System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + result);
    }
}