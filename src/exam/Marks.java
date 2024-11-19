package exam;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("\nResults:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Mark " + (i + 1) + " (" + marks[i] + "): ");
            if (marks[i] > 90) {
                System.out.println("Excellent");
            } else if (marks[i] >= 60) {
                System.out.println("Good");
            } else {
                System.out.println("Average");
            }
        }
        scanner.close();
    }
}

