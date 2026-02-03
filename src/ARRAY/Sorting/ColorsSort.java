package ARRAY.Sorting;

public class ColorsSort {
    public static void main(String[] args) {

      //  Input: nums = [2,0,2,1,1,0]
      //  Output: [0,0,1,1,2,2]
        int[] arr = {2,1,1,1,1,1,1,1,0,0,0,0,2,2,2,2,1,0,};
        int count0 = 0, count1 = 0, count2 = 0;
         int c0= count0, c1=count1, c2=count2;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]==0) count0++;
            else if ( arr[i]==1) count1++;
            else
                count2++;


        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0+count2; i++) {
            arr[i] = 1;

        }
        for (int i = count1; i < arr.length; i++) {
            arr[i] = 2;
        }
        for (int ele : arr)
            System.out.print(ele+" ");
       // System.out.println( count0+count1);
    }
}