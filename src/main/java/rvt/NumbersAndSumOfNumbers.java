package rvt;

import java.util.Scanner;

public class NumbersAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sk;

        System.out.println("Ievadiet skaitli: ");


        while (true) {
            sk = sc.nextLine();

            if (sk == 0) {
                System.out.println("Programma beidzas");
                break;
            }

            System.out.println("Jus ievadijat" + sk);
        }

        sc.close();
    }
}