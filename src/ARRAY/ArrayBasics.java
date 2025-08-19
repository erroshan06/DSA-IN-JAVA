package ARRAY;

public class ArrayBasics {
    public static void main(String[] args) {
//        int [] x = {6, 19, 7,69,9,171 ,5};
//        // indexing{0, 1,  2,    3}
//        System.out.println(x[0]);
//        x[3]= 89; // updating elements - mutability
//        System.out.println(x[5]);
//        System.out.println(x[3]);
        int [] arr = new  int [4]; // 4 size ka array
        arr[0] = 10 ;
        arr[1] = 20 ;
        arr[2] = 50 ;
        arr[3] = -8 ;
       for(int i= 0; i<4 ; i++){
           System.out.println(arr[i]);
       }
    }
}
