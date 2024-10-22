import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //prompt for operation
        System.out.println("What operation? \nAdd (1)\nSubtract (2)\nMultiply (3)\nDivide (4)");
        int operation = sc.nextInt();

        //what two numbers
        //first
        System.out.println("What is the first number?");
        int firstNumber = sc.nextInt();

        //second number
        System.out.println("What is the second number?");
        int secondNumber = sc.nextInt();

        if (operation == 1) {
            System.out.println(firstNumber + secondNumber);
        } else if (operation == 2) {
            System.out.println(firstNumber - secondNumber);
        } else if (operation == 3) {
            System.out.println(firstNumber * secondNumber);
        } else if (operation == 4) {
            System.out.println(firstNumber / secondNumber);
        }
    }
}