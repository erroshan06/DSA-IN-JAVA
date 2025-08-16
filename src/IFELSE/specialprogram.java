package IFELSE;

import java.util.Scanner;

public class specialprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a positive integer : ");
        int x = sc.nextInt();
        if (x %3 == 0 && x%5 ==0){
            System.out.println("Roshan");
        }
else if (x %3 ==0){
            System.out.println("Abhinaw");
        }
else if (x %5 == 0){
            System.out.println("Sachin");
        }
else
            System.out.println("condition failed ");
    }
}
