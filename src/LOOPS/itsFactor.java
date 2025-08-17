package LOOPS;

import java.util.Scanner;

public class itsFactor {

    public static void main(String[] args) {

        System.out.print("Enter the number to find its factor : ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }


        for (int i = 1; i<=Math.sqrt(n) ; i++){
            System.out.print(i+" ");
            if (i != (n/i)){
                System.out.print(n/i+" ");
            }
        }
    }

}
