package IFELSE;

import java.util.Scanner;

public class magnitudecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the integer : ");
        int num = sc.nextInt();
        int magnitude = Math.abs(num);

        if (magnitude < 69) {
            System.out.println("The magnitude of " + num + " is less than 69.");
        } else if (magnitude == 69) {
            System.out.println("The magnitude of " + num + " is exactly 69.");
        } else {
            System.out.println("The magnitude of " + num + " is greater than 69.");
        }

        sc.close();
    }
}

