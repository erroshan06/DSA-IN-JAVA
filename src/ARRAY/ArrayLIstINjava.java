package ARRAY;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIstINjava {
    public static void main(String[] args) {
        ArrayList <Integer> arr= new ArrayList<>();
         arr.add(25);
         arr.add(21);
         arr.add(3);
         arr.add(10);

       // System.out.println("Befor manuplated arr[2] :"+arr.get(2)); // arr[2]

         arr.set(2,50); // arr[2] = 50
      //  System.out.println("After manuplated arr[2] : "+arr.get(2));

        System.out.println(arr); // [ 25,21,50,10] :- not traversing the array by ourselves
         int n = arr.size(); // arr.length



        // for loop in arraylist
        for (int i = 0; i<n ; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
         // for each loop in arraylist :- same as in array
         for (int ele : arr)
             System.out.print(ele+" ");
        System.out.println();
 // 25 21 50 10

        arr.add( 78);  // 25 21 50 10 78

        arr.add(1,100);
        System.out.println(arr);

arr.remove(arr.size()  -1);

 int i= 0; int j= arr.size()-1;
 while (i<j){
     int temp= arr.get(i);
     arr.set(i ,arr.get(j));
     arr.set(j, (temp));
     i++;
     j--;
 }



//        Collections.reverse(arr);
        System.out.println(arr);
    }
}
