package rvt;
import java.util.Scanner;
public class Chapter44 {
    public static void main(String[] args) {
            // Testēšana
            ex1();
            System.out.println("---End of this task---");
            ex2();
            System.out.println("---End of this task---");
            ex3();
            System.out.println("---End of this task---");
            ex4();
            System.out.println("---End of this task---");
            ex5();
            System.out.println("---End of this task---");
            ex6();
            System.out.println("---End of this task---");
            ex7();
            System.out.println("---End of this task---");
        }
        public static void ex1() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String full = sc.nextLine().trim();

            int space = full.indexOf(" ");
            if (space <= 0) {
                System.out.println(full);
                return;
            }

            String first = full.substring(0, space);
            String last = full.substring(space + 1).toUpperCase();

            System.out.println(first + " " + last);
        }
        public static void ex2() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String s = sc.nextLine();

            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        }
        public static void ex3() {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Enter a name:");
                String line = sc.nextLine();

                if (line.length() == 0) break;

                String lower = line.toLowerCase();
                String title = "";

                if (lower.startsWith("amy") || lower.startsWith("buffy") || lower.startsWith("cathy"))
                    title = "Ms. ";
                else if (lower.startsWith("elroy") || lower.startsWith("fred") || lower.startsWith("graham"))
                    title = "Mr. ";

                System.out.println(title + line);
                System.out.println();
            }
        }
        public static void ex4() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter cook time-> ");
            String s = sc.nextLine();

            int len = s.length();

            int minutes = 0;
            int seconds;

            if (len <= 2) {
                seconds = Integer.parseInt(s);
            } else {
                seconds = Integer.parseInt(s.substring(len - 2));
                minutes = Integer.parseInt(s.substring(0, len - 2));
            }

            System.out.println("Your time-> " + minutes + ":" + String.format("%02d", seconds));
        }
        public static void ex5() {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.startsWith("//"))
                    System.out.println(line);
            }
        }
        public static void ex6() {
            Scanner sc = new Scanner(System.in);

             while (true) {
                System.out.println("Enter your password:");
                String pass = sc.nextLine();

                if (isAcceptable(pass)) {
                    System.out.println("Acceptable password.");
                    break;
                } else {
                    System.out.println("That password is not acceptable.\n");
                }
            }
        }

        private static boolean isAcceptable(String p) {
            if (p.length() < 7) return false;

            boolean hasUpper = !p.equals(p.toLowerCase());
            boolean hasLower = !p.equals(p.toUpperCase());
            boolean hasDigit = p.matches(".*\\d.*");

            return hasUpper && hasLower && hasDigit;
        }
        public static void ex7() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word -->");
            String w = sc.nextLine();

            int spaces = 0;

            while (w.length() > 0) {
                for (int i = 0; i < spaces; i++) System.out.print(" ");
                System.out.println(w);

                spaces++;
                if (w.length() <= 2) break;
                w = w.substring(1, w.length() - 1);
            }
    }
}
