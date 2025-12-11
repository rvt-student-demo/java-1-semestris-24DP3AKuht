package rvt;

import java.util.Scanner;

public class SecondsInDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadiet dienu skaitu: ");
        int days = scanner.nextInt();

        int seconds = days * 24 * 60 * 60;

        System.out.println("In " + days + "dienās" + seconds + " sekundes");
    }
    
}

