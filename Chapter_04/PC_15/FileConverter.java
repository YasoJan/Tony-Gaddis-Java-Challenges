/**************************************************************************************************** 
* Author: Yasin Zahir

* Uppercase File Converter

* 5/7/2026
*****************************************************************************************************/
import java.util.Scanner;
import java.io.*;

public class FileConverter{
  public static void main(String[] args){
    Scanner Keyboard = new Scanner(System.in);

    String banner = "--------------  Uppercase File Converter  --------------";
    String line;
    String fileName1;
    String fileName2;

    System.out.println(banner);

    System.out.print("Enter the name of a file: ");
    fileName1 = Keyboard.nextLine();

    System.out.print("Enter the name of a second file: ");
    fileName2 = Keyboard.nextLine();

    try{
      File readingFile = new File(fileName1);
      Scanner inputFile = new Scanner(readingFile);

      System.out.println("FILE EXISTS");
      PrintWriter outputFile = new PrintWriter(fileName2);

      while(inputFile.hasNext()){
        line = inputFile.nextLine();
        line = line.toUpperCase();
        outputFile.println(line);
      }
      inputFile.close();
      outputFile.close();
    }
    catch (FileNotFoundException e){
      System.out.println("File not found.");
   }

    System.out.println(banner);
    Keyboard.close();
  }
}