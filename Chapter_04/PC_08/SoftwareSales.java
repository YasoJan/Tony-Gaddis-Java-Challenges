/**************************************************************************************************** 
* Author: Yasin Zahir

* Software Sales

* 5/6/2026
*****************************************************************************************************/

import java.util.Scanner;

public class SoftwareSales{
  public static void main (String[] args){
    String banner = "--------------  Software Sales  --------------";

    final double FIRST_DISCOUNT = 0.20;
    final double SECOND_DISCOUNT = 0.30;
    final double THIRD_DISCOUNT = 0.40;
    final double FINAL_DISCOUNT = 0.50;

    int packages = 0;
    
    double packageCost = 99.00;
    double discount = 0.00;
    double total = 0.00;
    double preDiscountTotal = 0.00;
    Scanner keyboard = new Scanner(System.in);

    System.out.println(banner);

    System.out.print("Enter the number of packages purchased: ");
    packages = keyboard.nextInt();

    preDiscountTotal = packageCost * packages;

    if(packages >= 10 && packages <= 19){
      discount = FIRST_DISCOUNT * preDiscountTotal;
    }
    else if(packages >= 20 && packages <=49){
      discount = SECOND_DISCOUNT * preDiscountTotal;
    }
    else if(packages >= 50 && packages <=99){
      discount = THIRD_DISCOUNT * preDiscountTotal;
    }
    else if(packages >= 100){
      discount = FINAL_DISCOUNT * preDiscountTotal;
    }

    total = preDiscountTotal - discount;

    System.out.printf("Subtotal: $%,.2f%n", preDiscountTotal);
    System.out.printf("Discount: $%,.2f%n", discount);
    System.out.printf("Total: $%,.2f%n", total);

    System.out.println(banner);
  }
}