package ARRAY.Sorting;

public class Bubblesort {

    public static void print(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {3, 45, 6, 2, 8, -9, 0};


        for (int i = 0; i < arr.length - 1; i++) {     // n-1 passes
            boolean swap =  false ;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                     swap =  true ;
                }


            }
            if (swap ==  false ) break;
        }
        print(arr);
    }
}