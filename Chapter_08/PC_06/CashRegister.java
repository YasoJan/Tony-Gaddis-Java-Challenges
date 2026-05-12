/**************************************************************************************************** 
* Author: Yasin Zahir

* CashRegister class

* 5/11/2026
*****************************************************************************************************/

public class CashRegister{
  private RetailItem item;
  private int quantity;

  public CashRegister(RetailItem item, int quantity){
    this.item = item;
    this.quantity = quantity;
  }
  public double getSubtotal(){
    return item.getPrice() * quantity;
  }
  public double getTax(){
    final double SALES_TAX_RATE = 0.06;
    double subtotal = getSubtotal();
    return subtotal * SALES_TAX_RATE;
  }
  public double getTotal(){
    return getSubtotal() + getTax();
  }
}