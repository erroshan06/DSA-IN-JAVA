package LOOPS;
//
//public class WhileLoops {
//    public static void main(String[] args) {
//        int i = 1 ;
//        while (i <=Math.sqrt(100)){
//            System.out.print("Roshan ");
//            System.out.println(i);
//            i++;
//        }
//    }
//}

// do while loops

public class WhileLoops {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.print("Roshan ");
            System.out.println(i);
          i++;
        }
        while (i <= Math.sqrt(100));
    }
}

//for loop :-Best when you know beforehand how many times you want to run the loop.
   //         Initialization, condition, and update are all in one line.




//while loop :- Condition is checked before entering the loop.
//       If the condition is false at the start, the loop body may not run at all.






// do...while loop :- Condition is checked after executing the loop body.
//                   the body runs at least once, even if the condition is false.