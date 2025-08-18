package METHODS;

import java.util.Scanner;

public class maximumOF4number {
    public static void main(String[] args) {
        System.out.print("Enter a , b c and d : ");
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = Math.max(a,Math.max(b, Math.max( d,c)));
        System.out.println("Maximum among four :"+ max );
    }
}
