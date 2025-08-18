package PATTERNPRINT;

import java.util.Scanner;

public class FlippedTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
