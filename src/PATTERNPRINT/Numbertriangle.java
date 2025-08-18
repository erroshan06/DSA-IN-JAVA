package PATTERNPRINT;


import java.util.Scanner;

public class Numbertriangle {
    public static void main(String[] args) {
        System.out.print("enter the n for triangle:");
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i<=n  ;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
