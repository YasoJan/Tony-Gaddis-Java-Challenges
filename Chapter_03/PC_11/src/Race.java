/**************************************************************************************************** 
* Author: Yasin Zahir

* Running the Race

* 5/6/2026
*****************************************************************************************************/
import java.util.Scanner;

public class Race{
  public static void main(String[] args){
    String banner = "--------------  Running the Race  --------------";
    String runner1_name = "";
    String runner2_name = "";
    String runner3_name = "";
    String max_runner = "";
    String min_runner = "";
    String middle_runner = "";

    int max = 0;
    int min = Integer.POSITIVE_INFINITY;
    int middle = 0;

    int time1 = 0;
    int time2 = 0;
    int time3 = 0;

    Scanner k = new Scanner(System.in);
    /*************************************************COMPUTATION*************************************************/
    System.out.println(banner);
    
    System.out.print("Runner #1 name: ");
    runner1_name = k.nextLine();

    System.out.print("Runner #1 time: ");
    runner1_name = k.nextInt();

    System.out.print("Runner #2 name: ");
    runner2_name = k.nextLine();

    System.out.print("Runner #2 time: ");
    runner2_name = k.nextInt();

    System.out.print("Runner #3 name: ");
    runner3_name = k.nextLine();

    System.out.print("Runner #3 time: ");
    runner3_name = k.nextInt();

    if(runner1_time > max){
      max = runner1_time;
      max_runner = runner1_name;
    }
    if(runner2_time > max){
      max = runner2_time;
      max_runner = runner2_name;
    }
    if(runner3_time > max){
      max = runner3_time;
      max_runner = runner3_name;
    }
    if(runner1_time < min){
      min = runner1_time;
      min_runner = runner1_name;
    }
    if(runner2_time < min){
      min = runner2_time;
      min_runner = runner2_name;
    }
    if(runner3_time < min){
      min = runner3_time;
      min_runner = runner3_name;
    }

    System.out.println(banner);
  } 
}

/*
Write a program that asks for the names of three runners and the time, in minutes, it took each of them to finish a race. 
The program should display the names of the runners in the order that they finished.
*/