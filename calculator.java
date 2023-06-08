package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double first, second;
        String operator;
        System.out.print("Enter the operation: ");
        try {
            first = scanner.nextDouble();
            operator = scanner.next();
            second = scanner.nextDouble();
            scanner.close();
            switch (operator) {
                case ("/"): {
                    if (second != 0) {
                        System.out.println(first / second);
                    } else {
                        System.out.println("Cannot divide by 0");
                    }
                    break;
                }
                case ("*"): {
                    System.out.println(first * second);
                    break;
                }
                case ("+"): {
                    System.out.println(first + second);
                    break;
                }
                case ("-"): {
                    System.out.println(first - second);
                    break;
                }
            
            }
        } catch (InputMismatchException e) {
            System.out.println("Your input syntax is incorrect. Example of the correct format is: 1 + 1");
            main(null);
        }

    }
}