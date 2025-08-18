package METHODS;

public class Syntax {
    public static void roshan (){  // user - defined  function
        System.out.println("Coder");
        for(int i = 0 ; i<=3 ;i++){
            System.out.print("@ ");
        }
    }

    public static void main(String[] args) { // main function
       abhinaw();

        System.out.print("Harsh ");
        roshan(); // method call
        System.out.print("Shravan ");
        roshan();
    }
    public static void abhinaw() {
        System.out.println("404 ");
    }
}
