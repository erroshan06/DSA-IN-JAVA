package ARRAY;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 11; // :- starting of three elements shift to the end
         int n= arr.length;
           d= d%n;
    reverse(arr, 0,d-1);
    reverse(arr,  d, n-1 );
    reverse(arr, 0, n-1);


     for( int ele: arr)
        System.out.print( ele +" ");
    }

    public static void  reverse(int[] arr, int i, int j) {
        while (i < j) {
 int temp= arr[i];
 arr[i]= arr[j];
 arr[j]= temp;
i++;j--;

        }

    }
}