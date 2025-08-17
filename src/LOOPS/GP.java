package LOOPS;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        System.out.print("Enter the first  term and number of term :");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n= sc.nextInt() ;
        System.out.print("Enter the common ratio :");
int r =sc.nextInt();
        for (int i=  1; i<=n ; i++){
            System.out.println(a);
            a*=r;
        }
    }
}
