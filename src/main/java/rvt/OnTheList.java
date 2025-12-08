package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList names = new ArrayList<>();


        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
        names.add(input);
        }


        System.out.print("Search for? ");
        String search = scanner.nextLine();


        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }

        scanner.close();
    }
}