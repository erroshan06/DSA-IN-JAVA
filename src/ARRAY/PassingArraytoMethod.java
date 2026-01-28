package ARRAY;

public class PassingArraytoMethod {
    public static void main(String[] args) {
         int[] x={1 ,23,4,5,6,7};

        System.out.println(x[2]);
         change (x);

        System.out.println(x[2]);

    }
    public static void  change (int[] x) {
         x[2] =  87;


    }

}
