package rvt;

import java.util.Scanner;

public class detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadiet skrūvju daudzumu: ");
        int skruvji = scanner.nextInt();

        System.out.print("Ievadiet uzgriežņu daudzumu: ");
        int uzgriezni = scanner.nextInt();

        System.out.print("Ievadiet paplāksņu daudzumu: ");
        int paplaksni = scanner.nextInt();

        if (uzgriezni < skruvji) {
            System.out.println("Pārbaudi pasūtijumu: par maz uzgriežņu");
        }

        if (paplaksni < skruvji * 2) {
            System.out.println("Pārbaudi pasūtijumu: par maz paplakšņu");
        }
        double Kopa = skruvji * 5 + uzgriezni * 3 + paplaksni;
        System.out.print("Kopējā cena: " + Kopa);

        scanner.close();
    }


}
