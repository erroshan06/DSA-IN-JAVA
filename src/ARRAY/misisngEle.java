package ARRAY;

public class misisngEle {
    public static void main(String[] args) {
         int []arr={ 1,2,3,5,6,7,8};
          int n= arr.length+1;
           int sum= n*(n+1)/2;
            int arrSum= 0;
            for(int ele: arr){
                arrSum +=ele;
            }

        System.out.println(sum-arrSum);
    }
}
