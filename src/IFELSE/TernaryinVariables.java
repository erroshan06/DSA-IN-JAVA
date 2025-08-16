package IFELSE;

import java.util.Scanner;

public class TernaryinVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println((num>=0 ) ?100 :0);
    }
}
