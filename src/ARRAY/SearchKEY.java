package ARRAY;

import java.util.Scanner;

public class SearchKEY {


    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the length of array:");
        int n = sc.nextInt();
        System.out.print("Enter the array element:");
        int [] arr = new int[n]; // default value- [o,o,o,o,o,o]
        for (int i=0 ; i<arr.length; i++){

            arr[i]= sc.nextInt();
        }

        System.out.print("Enter the key  to search: ");
         int   key= sc.nextInt();
          boolean flag = false;
        for (int i=0 ; i<arr.length; i++) {
            if (key == arr[i]) {
                System.out.println( key  + "  exist in array ");
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Does not exist in array ");




sc.close();
    }
}
