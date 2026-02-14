package ARRAY.Sorting;

public class selection_sort {
    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = {56, 67, 3, 76, 9, 2, -1};
         print(arr);

        for (int i = 0; i < arr.length; i++) {
            int minEle = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minEle) {
                    minEle = arr[j];
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;


        }
        print(arr);


    }
}
