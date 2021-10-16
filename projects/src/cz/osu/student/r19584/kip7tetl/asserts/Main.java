package cz.osu.student.r19584.kip7tetl.asserts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter number to get factorial for: ");
        try {
            n = Integer.parseInt(sc.nextLine());
        } catch (Exception ignored) {
            throw new NumberFormatException("Input is not whole number (integer)");
        }

        double f = Factorial.factorial(n);
        System.out.printf("Factorial %d! = %.0f\n", n, f);

    }
}
