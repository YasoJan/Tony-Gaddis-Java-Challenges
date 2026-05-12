/**************************************************************************************************** 
* Author: Yasin Zahir

* RetailItem class

* 5/11/2026
*****************************************************************************************************/
import java.util.ArrayList;
public class RetailItemDemo{
  public static void main(String[] args){
    String banner = "--------------  RetailItem  --------------";
    ArrayList<RetailItem>items = new ArrayList<RetailItem>();
    items.add(new RetailItem("Jacket", 12, 59.95));
    items.add(new RetailItem("Designer Jeans", 40, 34.95));
    items.add(new RetailItem("Shirt", 20, 24.95));

    System.out.println(banner);
    for(int i =0; i<items.size(); i++){
      System.out.printf("Item: %d%n" , (i+1));
      System.out.println("Description: " + items.get(i).getDescription());
      System.out.println("Units: " + items.get(i).getUnitsOnHand());
      System.out.printf("Price: $%,.2f%n" , items.get(i).getPrice());
      if(i<items.size() - 1){
        System.out.println("--------------");
      }
    }
    
    System.out.println(banner);
  }
}