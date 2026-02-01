package ARRAY;

public class Add2SortedArray {
    public static void main(String[] args) {


        int[] arr1 = {2, 5, 6, 9};
        int[] arr2 = {1, 3, 4, 5, 7, 80};


        int[] arr3 = new int[arr1.length+ arr2.length];
        for (int ele :arr3)
            System.out.print( ele+" ");
        System.out.println();

        merge(arr3, arr1, arr2);

 for (int ele :arr3)
     System.out.print( ele+" ");
        System.out.println();

    }

    public static void merge ( int []c, int []a, int []b) {


 int i = 0, j= 0 , k= 0;
  while (i< a.length && j<b.length) {
      if (a[i] <= b[j]) {
          c[k++] = a[i++];

      } else {
          c[k++] = b[j++];
      }
  }
        while  (i< a.length){
                 c[k++] =a[i++];
       }
   while (j<b.length){
       c[k++] =b[j++];
      }
  }
//  1 feb ko solve krunga
  }

