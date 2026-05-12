/**************************************************************************************************** 
* Author: Yasin Zahir

* CashRegisterDemo

* 5/11/2026
*****************************************************************************************************/
import java.util.Scanner;
public class CashRegisterDemo{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    String banner = "--------------  CashRegisterDemo  --------------";
    int quantity = 0;
    RetailItem item = new RetailItem("Jacket", 12, 59.95);
    int maxUnits = item.getUnitsOnHand();

    System.out.println(banner);

    System.out.println("Description: " + item.getDescription());
    System.out.println("Units: " + maxUnits);
    System.out.printf("Price: $%,.2f%n" , item.getPrice());
    System.out.println("--------------");
    
    do{
      System.out.printf("Enter quantity of items being purchased (%d max): " , maxUnits);
      quantity = keyboard.nextInt();
    }while(quantity < 1 || quantity > maxUnits);

    CashRegister cr = new CashRegister(item, quantity);

    System.out.println("--------------");
    System.out.printf("Subtotal: $%,.2f%n" , cr.getSubtotal());
    System.out.printf("Sales Tax: $%,.2f%n" , cr.getTax());
    System.out.printf("Total: $%,.2f%n" , cr.getTotal());

    System.out.println(banner);
    keyboard.close();
  }
}