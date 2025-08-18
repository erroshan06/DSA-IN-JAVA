package METHODS;

import java.util.Scanner;

public class maxOFTHREE {
    public static void main(String[] args) {
        System.out.print("Enter a , b and c: ");
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a,Math.max( b,c));
        System.out.println("Maximum among three :"+ max );
    }
}
