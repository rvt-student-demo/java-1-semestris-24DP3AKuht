package rvt;

import java.util.Scanner;

public class NumbersAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sk;

        System.out.println("Ievadiet skaitli: ");


        while (true) {
            sk = scanner.nextLine();

            if (sk == 0) {
                System.out.println("Programma beidzas");
                break;
            }

            System.out.println("Jus ievadijat" + sk);
        }

        scanner.close();
    }
}