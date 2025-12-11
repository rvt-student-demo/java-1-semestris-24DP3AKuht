package rvt;

import java.util.Scanner;

public class delikates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.print("Ievdi cenu: ");
        int cena = Integer.parseInt(scanner.nextLine());

        System.out.print("Ekspress piegade (0==ne, 1==ja):");
        int ekspress = scanner.nextInt();

        if (ekspress == 1) {
            cena += 2;
        }

        System.out.println("Preces: " + prece);
        System.out.println("Galīgā cena: " + cena + " vienības");

    }
    
    
}

