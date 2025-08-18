package METHODS;

public class Minof3 {

        public static int min(int a, int b, int c) {
            if (a <= b && a <= c)
                return a;
            else if (b<= a && b <= c) return b;
            else return c;
        }

        public static void main(String[] args) {
            System.out.println(  min(3,5,-9));

        }
    }

