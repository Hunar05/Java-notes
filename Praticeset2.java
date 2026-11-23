//CHAPTER 2 PRATICE SET :- 

//Q1 What will be the result of following expression :- Float a = 7/4*9/2 ? 

// ANS 1 
/* 
public class CODING {
public static void main(String[] args) {
 float a = 7/4.0f*9/2.0f;
 System.out.println(a);   
}  
}*/

//Q2 Write a java Program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade ?

//ANS 2 
/*import java.util.Scanner ;
public class CODING {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter your grade");
  int grade = scanner.nextInt();

  //Encrypted grade 
  int Encryptgrade = grade + 8 ;
  System.out.println("Encrypted grade :" + Encryptgrade);

  //Decryptedgrade
  int Decryptedgrade = Encryptgrade - 8;
  System.out.println("Decryptedgrade :" + Decryptedgrade); 

}  
}*/

//Q3 Use Comparision operator to find out wheather a given number is greater than the user entered number or not ?

//ANS 3

/*import java.util.Scanner;
public class CODING {
public static void main(String[] args) {
Scanner check = new Scanner(System.in);
 int givennumber = 100;
 System.out.println("Enter the number you wanted to check ");
 int usernumber = check.nextInt(); 
 boolean b1= givennumber > usernumber; 
 System.out.println(b1);
}
}*/

//Q4 Write the following expression in a java program :- v^2-u^2/2as ?

//ANS 4 

/*public class CODING{
  public static void main (String[] args){
  int v =5;
  int u = 3;
  int a =4;
  int s = 2;
  int result = (v*v - u*u)/(2*a*s);
  System.out.println(result);
  }
}*/

//Q5 find the value of the following expression :- int x = 7,int a = 7*49/7+35/7, value of a ?

//ANS 5
/* 
public class CODING{
  public static void main(String[] args) {
      int x = 7;
      int a =7*49/7+35/7;
      System.out.println(a);
  }
}*/


