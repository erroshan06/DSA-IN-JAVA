package METHODS;

public class User_defined {
    public static void roshan(){
        System.out.println("Ajay");
    }

    public static void main(String[] args) {
        roshan();
        Abhinav();
        sachin();
    }
    public static  void Abhinav(){
        System.out.println("sachin");
    }
    public static  void sachin(){
        System.out.println("1234");
        roshan ();
        Abhinav();

    }
}
