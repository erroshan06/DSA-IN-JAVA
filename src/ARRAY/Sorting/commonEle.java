package ARRAY.Sorting;

public class commonEle {

    // to sort arrays
    public static void bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;

        }
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 54, 6, 8, 37, 95};
        int[] arr2 = {1, 6, 8, 37, 9, 0, 74, 5};

        System.out.print("sorted Arr1: ");
        bubblesort(arr1);
        System.out.print("sorted Arr2: ");

        bubblesort(arr2);
        int[] ans = new int[Math.min(arr1.length, arr2.length)];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {

                ans[k++] = arr1[i];
                i++;
                j++;

            } else if (arr1[i] < arr2[j]) i++;
            else j++;
        }
        System.out.print("Common Element: ");
        for (int z = 0; z < k; z++)
            System.out.print(ans[z] + " ");
        System.out.println();
    }


}

