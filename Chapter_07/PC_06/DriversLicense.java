/**************************************************************************************************** 
* Author: Yasin Zahir

* Driver’s License exam

* 5/9/2026
*****************************************************************************************************/

import java.util.Scanner;
import java.util.ArrayList;

public class DriversLicense{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Character>studentAnswers = new ArrayList<Character>();
    char answer;
    for(int i = 1; i<=20; i++){
      do {
      System.out.print(i + ".) Enter answer (A, B, C, or D): ");
      answer = keyboard.next().charAt(0);
      answer = Character.toUpperCase(answer);
      }while(answer != 'A' && answer != 'B' && answer!= 'C' && answer != 'D');
      studentAnswers.add(answer);
    }
    DriverExam exam = new DriverExam(studentAnswers);

    int totalCorrect = exam.totalCorrect();
    int totalIncorrect = exam.totalIncorrect();
    ArrayList<Integer>questionsMissed = exam.questionsMissed();
    boolean passed = exam.passed();

    if(passed){
      System.out.println("PASSED");
    }
    else{
      System.out.println("FAILED");
    }
    System.out.println("Total Correct: " + totalCorrect);
    System.out.println("Total Incorrect: " + totalIncorrect);
    System.out.println("Questions Missed: " + questionsMissed);
    keyboard.close();
  }
}

