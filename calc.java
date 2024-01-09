import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        // Input first number
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // Input second number
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        scanner.close();
        // Perform calculation based on operator
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
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}
