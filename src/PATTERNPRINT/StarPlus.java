package PATTERNPRINT;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        System.out.println("Enter the n : "); //n is odd
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n ; i++){
            for (int j= 1; j<=n ; j++){
                int mid = (n/2 )+1;
                if ( i ==mid || j== mid  ){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
