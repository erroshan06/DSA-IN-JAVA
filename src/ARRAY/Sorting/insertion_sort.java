package ARRAY.Sorting;

public class insertion_sort {
    public static void main(String[] args) {
         int[] arr={1,4,2,5,7,8,5,8,976,32,134,5};
          for ( int i= 0; i< arr.length ; i++){
               int j= i;
                while (j > 0 &&  arr[j] < arr[j-1]){
                     int temp = arr[j];
                     arr[j]= arr[j-1];
                     arr[j-1]= temp ;
                 j--;
                }

          }


           for( int ele : arr)
               System.out.print(ele +" ");
    }
}
