package BASICS;

import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System .in);
        System.out.print("Enter Radius :");
        double  r = sc.nextDouble() ;
        double area = 3.1415 * r * r ;
        System.out.print("Area =  ");
        System.out.println(area);
    }
}
