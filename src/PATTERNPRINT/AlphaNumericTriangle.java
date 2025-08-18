package PATTERNPRINT;

import java.util.Scanner;

public class AlphaNumericTriangle {
    public static void main(String[] args) {
        System.out.print("enter the n for triangle:");
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i<=n  ;i++) {
            if (i% 2== 0){
                for (int j = 1; j <= i; j++) {

                    System.out.print((char) (64 + j)+ " ");
                }
                System.out.println();
            }
               else
                {
                    for (int j = 1; j <= i; j++) {
                    System.out.print(j+" " );
                }
                    System.out.println();
            }

        }

        }
    }

//// 1
//A B
// 1 2 3
//A B C D