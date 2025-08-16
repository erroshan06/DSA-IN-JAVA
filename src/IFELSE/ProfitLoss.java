package IFELSE;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the cost price :");
        int cost_p = sc.nextInt();
        System.out.print("Enter the selling price ");
        int sell_p = sc.nextInt();
        int  profit = sell_p -cost_p ;
         if ( profit >0){

             System.out.println( "the seller has made profit of " + profit);
             double percentage =((double) profit /cost_p)*100 ;
             System.out.print( "profit (in %): " + percentage);
           //  System.out.println((profit /cost_p)*100);
         }
         else if (profit <0) {
             System.out.println("the seller has made loss of " + Math.abs(profit));
          double    Losspercentage = ( (double)Math.abs(profit) / cost_p) * 100;
             System.out.print("loss  (in %): " + Losspercentage);
         }
         else
             System.out.println("The seller has made neither  profit  nor not loss");
  sc.close();
    }
}
