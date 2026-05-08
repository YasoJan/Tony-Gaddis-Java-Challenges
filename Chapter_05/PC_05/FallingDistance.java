/**************************************************************************************************** 
* Author: Yasin Zahir

* Falling Distance

* 5/7/2026
*****************************************************************************************************/

public class FallingDistance{
  public static void main(String[] args){
    String banner = "--------------  Falling Distance  --------------";

    System.out.println(banner);
    for(int i =1; i<=10; i++){
      System.out.printf("Distance: %,.1fm%n", fallingDistance(i));
    }
    System.out.println(banner);
  }
  public static double fallingDistance(int time){
    final double GRAVITY = 9.8;
    double distance = 0.5 * GRAVITY * Math.pow(time, 2);
    return distance;
  }
}