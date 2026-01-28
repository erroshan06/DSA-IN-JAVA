 // multiply odd indexed elements by 2 and
 //  add 10 to even  indexed elements
package ARRAY;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the length of array");
         int n = sc.nextInt();
        System.out.println("Enter the array element:");
        int [] arr = new int[n]; // default value- [o,o,o,o,o,o]
        for (int i=0 ; i<arr.length; i++){

            arr[i]= sc.nextInt();
        }

        for (int i=0 ; i<arr.length; i++){
             if ( i%2== 0){
                  arr[i]+= 10;
            System.out.print( arr[i]+" ");
        }
         else {
                 arr[i] *= 2;
                 System.out.print(arr[i] + " ");

             } }


    }
}
