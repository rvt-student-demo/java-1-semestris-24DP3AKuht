package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList numbers = new ArrayList<>();


        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }


        System.out.print("From where? ");
        int startIndex = scanner.nextInt();

        System.out.print("To where? ");
        int endIndex = scanner.nextInt();


        for (int i = startIndex; i <= endIndex; i++) {
        System.out.println(numbers.get(i));
        }

        scanner.close();
    }
}
