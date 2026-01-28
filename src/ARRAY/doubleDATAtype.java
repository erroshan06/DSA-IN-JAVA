package ARRAY;

public class doubleDATAtype {
    public static void main(String[] args) {
        double[] arr = new double[]{1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // character  data type
        char[] charac = new char[]{'a','b','c','d','e','f'};
        for (int i = 0; i < charac.length; i++) {
            System.out.print(charac[i]+" ");
        }
        System.out.println();
         char ch='\0'; // null character
        System.out.println((int)ch);

    }
}
