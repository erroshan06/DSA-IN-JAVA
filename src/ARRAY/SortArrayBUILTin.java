package ARRAY;
import  java.util.Arrays;

public class SortArrayBUILTin {
    public static void main(String[] args) {
        // sort - ascending order
         int[] arr={4,1,2,4,6,8,4,7,10};
          print(arr);
          Arrays.sort(arr);
          print(arr);

    }
    public static void  print ( int[] arr) {
        // sort - ascending order
        for(int i= 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
