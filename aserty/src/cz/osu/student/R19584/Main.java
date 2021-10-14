package cz.osu.student.R19584;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Zadejte n: ");
        try {
            n = Integer.parseInt(sc.nextLine());
        } catch(Exception ignored) {
            throw new NumberFormatException("Input is not whole number (integer)");
        }

        double f = Factorial.factorial(n);
        System.out.printf("Faktorial %d! = %.0f\n", n, f);

    }
}
