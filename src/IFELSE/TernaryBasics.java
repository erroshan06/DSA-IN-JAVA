package IFELSE;

import java.util.Scanner;

public class TernaryBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int n = sc.nextInt();
        System.out.println(n+" : "+(n%2==0 ? "even" : "odd"));
    }
}
