package rvt;

import java.util.Scanner;

public class sumOfSequence {

    public static void main(String[] args) {

    

    Scanner scanner = new Scanner(System.in);

    System.out.print("First number: ");
    int first_sk = scanner.nextInt();

    System.out.print("Last number: ");
    int second_sk = scanner.nextInt();
    int Rez = 0;

    while (first_sk < second_sk + 1) {
        Rez = Rez + first_sk;
        first_sk = first_sk + 1;


    }

    System.out.print("The sum is: " + Rez);


    scanner.close();
}
}
