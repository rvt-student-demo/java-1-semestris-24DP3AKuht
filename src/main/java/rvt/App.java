package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)

        System.out.print("Give ohe first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Give the second number: ");
        int num2 = scanner.nextInt();

        int summa = num1 + num2;

        int starpiba = num1 - num2;

        int reizinasana = num1 * num2;

        double dalisana = 1.0 * num1 / num2;
        
        System.out.println(summa);
        System.out.println(starpiba);
        System.out.println(reizinasana);
        System.out.println(dalisana);

    }
}
