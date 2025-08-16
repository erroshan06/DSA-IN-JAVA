package IFELSE;

import java.util.Scanner;

public class isFourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = sc.nextInt();
        if (x >999 && x<10000){
            System.out.println(x +" is a 4 digits number");
        }
        else
            System.out.println(x + " is not a 4 digits numbers" );
    }
}
