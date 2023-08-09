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
            throw new IllegalArgumentException("Недопустимый ввод");
        }

        int a;
        int b;
        try {
            a = Integer.parseInt(values[0]);
            b = Integer.parseInt(values[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Недопустимые числа");
        }
        if (a < 1 || a > 10) {
            throw new IllegalArgumentException("throws Exception //Числа должны быть от 1 до 10");
        }
        if (b < 1 || b > 10) {
            throw new IllegalArgumentException("throws Exception //Числа должны быть от 1 до 10");
        }

        int result = switch (values[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Недопустимая операция");
        };
        if (result > 20) throw new IllegalArgumentException("Сумма больше 20");
        return String.valueOf(result);
    }
}