package LOOPS;

import java.util.Scanner;

public class printNto1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner( System.in);

        int n = sc.nextInt();
        for (int i =  n ; i>=1 ; i-- ){
            System.out.print( i+" ");
        }
    }
}
