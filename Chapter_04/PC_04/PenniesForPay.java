/**************************************************************************************************** 
* Author: Yasin Zahir

* Pennies For Pay

* 5/7/2026
*****************************************************************************************************/
import java.util.Scanner;

public class PenniesForPay{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String banner = "--------------  Pennies For Pay  --------------";

    int daysWorked = 0;
    long pennies = 1;

    double total = 0.00;
    double dollars = 0.00;

    final int PENNIES_TO_DOLLAR = 100;

    System.out.println(banner);

    do{
    System.out.print("Enter days worked: ");
    daysWorked = keyboard.nextInt();
    }while(daysWorked < 1);

    for(int i =1; i<=daysWorked; i++){
      dollars = (double)pennies/PENNIES_TO_DOLLAR;
      total+= dollars;
      System.out.printf("Salary: $%,.2f%n", dollars);
      System.out.printf("Total: $%,.2f%n", total);
      pennies *=2;
    }

    System.out.println(banner);

    keyboard.close();
  }
}