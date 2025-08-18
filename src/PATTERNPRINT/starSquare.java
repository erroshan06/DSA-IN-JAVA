package PATTERNPRINT;


import java.util.Scanner;

public class starSquare {
    public static void main(String[] args) {
        System.out.println("Enter the rows (n x n):");
        Scanner sc = new Scanner( System.in);
        int rows = sc.nextInt();
       // int col = sc.nextInt();

        for (int i= 1; i<=rows ;i++){
            for (int j= 1; j<=rows ; j++)
                System.out.print("* ");
            System.out.println();
        }

    }
}
