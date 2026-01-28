package ARRAY;
import java.util.Scanner;
public class MAXelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    //int max= arr[0];
         int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Maximum element: "+ max);

     //   System.out.println(arr[-1]); //Index -1 out of bounds for length 5
        System.out.println(arr.length);
        sc.close();
    }
}