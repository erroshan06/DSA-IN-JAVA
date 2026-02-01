package ARRAY;

import java.util.ArrayList;
import java.util.Collections;

public class Add2arrays {
    public static void main(String[] args) {
         int []arr1= {2,3,4,5,6};
          int []arr2 ={1,3,4,5,7,8,9,2};

        ArrayList<Integer> ans = new ArrayList<>();

         int i= arr1.length - 1;
         int j = arr2.length-1 ;
          int carry = 0;

           while(i>=0 || j>=0 || carry !=0)
           {
               int sum = carry;
                if (i>= 0){
                    sum+= arr1[i];
                    i--;

                }
                 if (j>=0){
                      sum+= arr2[j];
                      j--;

                 }

                  ans.add(sum %10);
                 carry = sum/10;
           }

        Collections.reverse(ans);
        System.out.print(ans +" ");

    }
}
