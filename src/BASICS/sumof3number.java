package BASICS;

import java.util.Scanner;

public class sumof3number {
    public static void main(String[] args) {
        int x , y , z ;
        Scanner sc = new Scanner(System.in );
        System.out.println( "Enter the number x , y and z :");
        x = sc .nextInt();
        y = sc.nextInt();
        z= sc.nextInt();
        int sum = x+y+z ;
        System.out.print("Sum of these 3 numbers : ");
        System.out.println(sum );
    }
}
