/**************************************************************************************************** 
* Author: Yasin Zahir

* Present Value

* 5/7/2026
*****************************************************************************************************/
import java.util.Scanner;
public class PresentValue{
  public static void main(String[] args){
    String banner = "--------------  Present Value  --------------";
    Scanner keyboard = new Scanner(System.in);
    double futureValue = 0.00;
    double interestPercentage = 0.0;
    double annualIR = 0.0;
    double currValue = 0.00;
    final double PERCENT_TO_DECIMAL = 100.0;

    int years = 0;

    System.out.println(banner);

    System.out.print("Enter future value that you want in the account: $");
    futureValue = keyboard.nextDouble();

    System.out.print("Enter the annual interest rate: ");
    interestPercentage = keyboard.nextDouble();

    annualIR = interestPercentage / PERCENT_TO_DECIMAL;

    System.out.print("Enter number of years that you plan to let the money sit in the accounts: ");
    years = keyboard.nextInt();

    currValue = presentValue(futureValue, annualIR, years);

    System.out.printf("Amount that you need to deposit today: $%,.2f%n", currValue);

    System.out.println(banner);
    keyboard.close();
  }
  public static double presentValue(double futureValue, double annualIR, int years){
    double currValue = futureValue / (Math.pow((1 + annualIR), years));
    return currValue;
  }
}