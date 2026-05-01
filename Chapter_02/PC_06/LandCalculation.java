/**************************************************************************************************** 
* Author: Yasin Zahir

* Land calculation

* 4/30/2026
*****************************************************************************************************/

/*
One acre of land is equivalent to 43,560 square feet.
Write a program that calculates the number of acres in a tract of land with 389,767 square feet. 
Hint: Divide the size of the tract of land by the size of an acre to get the number of acres.

*/

public class LandCalculation{
  public static void main(String[] args){
    String banner =  "--------------  Land calculation  --------------";
    final int ACRE_SQFT = 43560;
    int tract_land = 389767;
    
    System.out.println(banner);
    System.out.println("Number of acres in 389,767 square feet: " + tract_land);
    System.out.println(banner);
  }
}