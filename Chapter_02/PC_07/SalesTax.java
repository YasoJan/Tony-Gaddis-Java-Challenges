/**************************************************************************************************** 
* Author: Yasin Zahir

* Sales Tax

* 5/6/2026
*****************************************************************************************************/
import java.util.Scanner;

public class SalesTax{
  public static void main(String[] args){
    String banner = "--------------  Sales Tax  --------------";

    final double STATE_TAX_RATE= 0.04;
    final double COUNTY_TAX_RATE = 0.02;
    final double TOTAL_TAX_RATE = STATE_TAX_RATE + COUNTY_TAX_RATE;

    double purchase = 0.00;
    double stateSalesTax = 0.00;
    double countySalesTax = 0.00;
    double totalSalesTax = 0.00;
    double saleTotal = 0.00;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println(banner);

    System.out.print("Enter the amount of a purchase: $");
    purchase = keyboard.nextDouble();
    
    stateSalesTax = STATE_TAX_RATE * purchase;
    countySalesTax = COUNTY_TAX_RATE * purchase;
    totalSalesTax = TOTAL_TAX_RATE * purchase;
    saleTotal = totalSalesTax + purchase;

    System.out.printf("Purchase: $%,.2f%n",  purchase);
    System.out.printf("State Sales Tax: $%,.2f%n" , stateSalesTax);
    System.out.printf("County Sales Tax: $%,.2f%n" , countySalesTax);
    System.out.printf("Total Sales Tax: $%,.2f%n" , totalSalesTax);
    System.out.printf("Sale Total: $%,.2f%n" , saleTotal);
    
    System.out.println(banner);

    keyboard.close();
  }
}