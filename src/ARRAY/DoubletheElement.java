//package ARRAY;
import  java.util.Scanner;
public class DoubletheElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the element of array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(" Double of the element are:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(2 * arr[i] + " ");

        }
        sc.close();
    }
}
