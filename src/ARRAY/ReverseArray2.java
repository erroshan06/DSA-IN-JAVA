package ARRAY;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr= {6,8,1,2,4,9};
        int n= arr.length;




// swap only b/w index 1 to 4:-
        int i= 1 , j=  4 ;
        while (i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele +" ");
        }
    }
}
