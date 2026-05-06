// CHAPTER 01 - PRATICE SET :- 

//Q1 Write a program to sum three numbers in Java

//ANS 1
 /*public class CODING {
   public static void main(String[] args) {
      int num1 = 20;
      int num2 = 30;
      int num3 = 50;
      int add = num1+num2+num3;
      System.out.println(add);
  }
}*/

//Q2 Write va program to calculate CGPA using marks of three subjects (out of 100)

//ANS 2
/*import java.util.Scanner;
public class CODING {
  public static void main(String[] args) {
    Scanner grade = new Scanner(System.in);
    System.out.println("Enter the grade of subject 1 :- ");
    float sub1 = grade.nextFloat();
    System.out.println("Enter the grade of subject 2 :- ");
    float sub2 = grade.nextFloat();
    System.out.println("Enter the grade of subject 3 :- ");
    float sub3 = grade.nextFloat();
    float addition = sub1+sub2+sub3;
    System.out.print("Your cgpa is :- ");
    System.out.println(addition/3);
  }
}*/

// Q3 Write a Java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day" text

//ANS 3 
/* 
import java.util.Scanner;
public class CODING{
  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    System.out.println("Enter your name :- ");
    String str = name.next();
    System.out.println("Hello "+ str +" Have a good day");

  }
}
*/

//Q4 Write a Java program to convert Kilometers to miles

//ANS 4
/*import java.util.Scanner;
public class CODING{
  public static void main(String[] args) {
    Scanner converter = new Scanner(System.in);
    System.out.println("Enter the number which you wanted to convert to miles :- ");
    double num = converter.nextDouble();
    System.out.println(num * 0.621);
  }
}*/

//Q5 Write a Java program to detect whether a number entered by the user is integer or not

//ANS 5
/*import java.util.Scanner;
public class CODING{
public static void main(String[] args) {
  Scanner check = new Scanner(System.in);
  System.out.println("Enter the number to check weither it is integer or not :-");
 boolean b1 = check.hasNextInt();
 System.out.println(b1); 
}
}
*/
