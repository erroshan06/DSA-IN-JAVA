package PATTERNPRINT;


import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        System.out.println("Enter n ( for n x n square):");
        Scanner sc = new Scanner( System.in);
        int rows = sc.nextInt();


        for (int i= 1; i<=rows ;i++){
            for (int j= 1; j<=rows ; j++)
                System.out.print((char)(64 + j) +" ");
            System.out.println();
        }

    }
}
