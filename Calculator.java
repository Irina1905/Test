import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите операцию: ");
        String operation = scanner.nextLine();

        String[] parts = operation.split(" ");
        int operand1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int operand2 = Integer.parseInt(parts[2]);
        int result = 0;
        if (operand1 > 0 && operand1 <= 10 && operand2 > 0 && operand2 <= 10 && parts.length == 3) {
            switch (operator) {
                case "+" -> result = operand1 + operand2;
                case "-" -> result = operand1 - operand2;
                case "*" -> result = operand1 * operand2;
                case "/" -> result = operand1 / operand2;
                default -> System.out.println("Неверный оператор");
            }
            System.out.println("Результат: " + result);
        } else {
            throw new Exception();
        }
    }
}