package IFELSE;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("enter the length and breadth of rectangle : ");
        int a  =sc.nextInt();
        int b = sc.nextInt();
        int area = a *b ;
        int perimeter = 2*(a+b);
        System.out.println("area of rectangle :"+area);
        System.out.println("Perimeter of rectangle :"+ perimeter);
        if (area > perimeter){
            System.out.println("Area of rectangle is greater than its perimeter");
        }
        else if (area <perimeter){

            System.out.println("Area of rectangle is lesser than its perimeter");
        }
        else
            System.out.println("equal");
    }
}
