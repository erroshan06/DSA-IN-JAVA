package ARRAY;

import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {

       Scanner sc = new Scanner( System.in);
//        int  n = sc.nextInt();
//        int []arr  = {1,2,3,4,5,6,7,8,-8,-4};
//        System.out.println(arr.length );
//        for(int i= 0 ; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
        System.out.println("Enter the array element:");
    int [] arr = new int[7]; // default value- [o,o,o,o,o,o]
    for (int i=0 ; i<arr.length; i++){
        int  n = sc.nextInt();
     arr[i]= n;
    }
        for (int i=0 ; i<arr.length; i++){
            System.out.println("array ele :"+ arr[i]);
        }


    }
}
