package input_output;

import java.util.Scanner;

public class ConsoleInputExcample {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Тикни перше значення: ");
        long number1 = scanner.nextLong();

        System.out.println("Тикни операцію: ");
        String operation = scanner.next();

        System.out.println("Тикни друге значення: ");
        long number2 = scanner.nextLong();

        System.out.println(calculate.makeOperation(number1, number2, operation));
    }
}
