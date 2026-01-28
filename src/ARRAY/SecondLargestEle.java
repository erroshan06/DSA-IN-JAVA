package ARRAY;

public class SecondLargestEle {
    public static void main(String[] args) {
        int[] arr = {4, 10, 10, 6, 3, 8};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;


        //largest element
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];

            }
        }

     // second largest
        for (int i = 0; i < arr.length; i++) {

            if (smax < arr[i] && max != arr[i]) {
                smax = arr[i];

            }
        }
        System.out.println("    MAximum element: " + max);
        System.out.println("Second Maximum element: " + smax);
    }
}

