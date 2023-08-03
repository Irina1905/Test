import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        System.out.println(calc(input));
    }
    public static String calc(String input) {
        String[] values = input.split(" ");
        if (values.length != 3) {
            throw new IllegalArgumentException("Invalid input");
        }

        int a;
        int b;
        try {
            a = Integer.parseInt(values[0]);
            b = Integer.parseInt(values[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid numbers");
        }

        int result = switch (values[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Invalid operation");
        };
        return String.valueOf(result);
    }
}