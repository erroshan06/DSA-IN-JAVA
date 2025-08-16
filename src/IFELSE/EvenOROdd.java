package IFELSE;


import java.util.Scanner;

public class EvenOROdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer :");
        int  x  = sc.nextInt();
        if (x %2 == 0){
            System.out.println(x+" is even");
            System.out.println("you can divide "+ x +" is in equal two parts ");
        }
        else {
            System.out.println(x+" is odd");
        }

    }
}
