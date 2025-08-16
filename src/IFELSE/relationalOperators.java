package IFELSE;

public class relationalOperators {
    public static void main(String[] args) {
//                 Operator | Meaning                  | Example (`a = 8, b = 9`) | Result |
//                 -------- | ------------------------ | ------------------------ | ------ |
//                 `>`      | Greater than             | `a > b` → `8 > 9`        | false  |
//                 `<`      | Less than                | `a < b` → `8 < 9`        | true   |
//                 `==`     | Equal to                 | `a == b` → `8 == 9`      | false  |
//                 `!=`     | Not equal to             | `a != b` → `8 != 9`      | true   |
//                 `>=`     | Greater than or equal to | `a >= b` → `8 >= 9`      | false  |
//                 `<=`     | Less than or equal to    | `a <= b` → `8 <= 9`      | true   |
//
   boolean x= 8>9;
        System.out.println(x);
        x= 8<9;

        System.out.println(x);
        x= 8==9;

        System.out.println(x);
        x= 8!=9;

        System.out.println(x);
        x= 8>=9;
        System.out.println(x);
        x = 8<=9;
        System.out.println(x);
    }
}
