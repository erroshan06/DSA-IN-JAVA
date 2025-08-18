package PATTERNPRINT;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the rows and coloumn (n x n) :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }
            System.out.println();
        }


    }
}
