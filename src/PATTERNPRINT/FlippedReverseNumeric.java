
package PATTERNPRINT;

import java.util.Scanner;
public class FlippedReverseNumeric {
    public static void main(String[] args) {
        System.out.println("Enter the n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >=n-i+1; j--) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
