package ARRAY;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, -3};
          boolean found = false  ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 2) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true ;
                }
            }
        }
        if (!found)
        System.out.println("not found ");

    }
}
