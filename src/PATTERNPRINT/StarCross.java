package PATTERNPRINT;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        System.out.println("Enter the n : "); //n is odd
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n ; i++){
            for (int j= i; j<=n-i ; j++){

                    System.out.print("* ");
                }
            }
            System.out.println();
        }
}