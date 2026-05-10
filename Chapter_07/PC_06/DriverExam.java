/**************************************************************************************************** 
* Author: Yasin Zahir

* Driver’s License exam

* 5/7/2026
*****************************************************************************************************/
import java.util.ArrayList;

public class DriverExam{
  private ArrayList<Character> correctAnswers = new ArrayList<Character>();
  private ArrayList<Character> studentAnswers; // Declare without initializing, let constructor assign

  public DriverExam(ArrayList<Character> studentAnswers){
    this.studentAnswers = studentAnswers;
    correctAnswers.add('B');
    correctAnswers.add('D');
    correctAnswers.add('A');
    correctAnswers.add('A');
    correctAnswers.add('C');
    correctAnswers.add('A');
    correctAnswers.add('B');
    correctAnswers.add('A');
    correctAnswers.add('C');
    correctAnswers.add('D');
    correctAnswers.add('B');
    correctAnswers.add('C');
    correctAnswers.add('D');
    correctAnswers.add('A');
    correctAnswers.add('D');
    correctAnswers.add('C');
    correctAnswers.add('C');
    correctAnswers.add('B');
    correctAnswers.add('D');
    correctAnswers.add('A');

  }
  public int totalCorrect(){
    int total = 0;
    for(int i =0; i<studentAnswers.size(); i++){
      if(studentAnswers.get(i) == correctAnswers.get(i)){
        total+=1;
      }
    }
    return total;
  }
  public int totalIncorrect(){
    int correctAnswers = totalCorrect();
    return studentAnswers.size() - correctAnswers;
  }
  public boolean passed(){
    if(totalCorrect() >= 15){
      return true;
    }
      return false;
  }
  public ArrayList<Integer> questionsMissed(){
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i =0; i<studentAnswers.size(); i++){
      if(studentAnswers.get(i) != correctAnswers.get(i)){
        arr.add(i+1);
      }
    }
    return arr;
  }
}





/*
A student must correctly answer 15 of the 20
Write a class named DriverExam that holds the
The class should also have an array field that holds the student’s answers. The class should have the following methods:
• passed. Returns true if the student passed the exam, or false if the student failed
• totalCorrect. Returns the total number of correctly answered questions
1. B 2. D 3. A 4. A 5. C
11. B 12. C 13. D 14. A 15. D
16. C 17. C 18. B 19. D 20. A
questions to pass the exam.
Programming Challenges 489
correct answers to the exam in an array field.
490 Chapter 7 Arrays and the ArrayList Class
• totalIncorrect. Returns the total number of incorrectly answered questions
• questionsMissed. An int array containing the question numbers of the questions that
the student missed
Demonstrate the class in a complete program that asks the user to enter a student’s answers,
and then displays the results returned from the DriverExam class’s methods. Input Validation: Only accept the letters A, B, C, or D as answers.
*/