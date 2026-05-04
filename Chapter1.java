// chapter1 - variable and data types :- 
/*
just like we have some rules that we follow to speak english (gramer), we have some rules to follow while writing a java program. The set of these rule is called syntax
*/

// VARIABLES :- A varibles is a container that stores a value this value can be changed during the execution of the program 
/*
Ex:- int number = 8;
*/  

//RULES FOR DECLARING A VARIABLE NAME :- 
/*
 we can choose a name while declaring a java variable if the following rules are followed :-  
  
(1) must not begin with a digit ---> int 1arry is invalid 

(2)Name is case sensitive --> harry and Harry are different 

(3)should not be a keyword (like void)

(4)white space are not allowed --> int Code With Harry is invalid

(5)can contain alphabets,$character,_character and digits if the other condition are not
*/

//Data types :- Data types in java fall under the following categories 

//(1) primitive data types (Intreinsic)

//(2)Non-primitive Data types (Derived)

//Primitive data types :-
/*
 java is statically typed --> variable must be declared before use  

There are 8 primitive data types supported by java :- 

(1)byte :- (a) value ranges from -128 to 127
(b) Takes 1 byte 
(c)Default value is 0

(2)short :- (a)Value ranges from (-2^16)/2 to (2^16)/2
(b)Takes 2 byte 
(c)Default value is 0

(3)int:- (a)value ranges from (-2^32)/2 to (2^32)/2
(b)Takes 4 bytes
(3)Default value is 0

(4)float :- (a)value ranges from (see Doc)
(b)Take 4bytes
(c)Default value is 0.0f

(5)long :- (a)value range from (-2^64)/2 to (2^64)/2
(b)Takes 8bytes
(c)Defalut default value is 0 

(6)double :- (a)value range from (see Docs)
(b)Takes 8 bytes
(c)Default value is 0.0d

(7)char :- (a)value ranges from 0 to 65535(2^16 -1)
(b)takes 2bytes --> because it suppor unicode 
(c)Default value is 00000

(8)Boolean :- (a) value can be true or false 
(b)size depends on Jvm
(c)Default value is false 
*/

//Quick quize :- write a java program to add three numbers 

/*public class MAIN{
public static void main(String[] args){
  int num1 = 5;
  int num2 = 7;
  int num3 = 8;
  int sum = num1+num2+num3;
  System.out.println("The sum of three number is");
  System.out.println(sum);
}
}*/ 

//Q How to choose data types for our variables 

/*
In order to choose the data type we first need to find the type of data we want to store. After that we need to analyze the min and max value we might use
 */

 //LITERALS :- A constant value which can be assigned to the variable is called as a literal 
/*
101 --> integer literal
10.1f --> float literal
10.1 --> double literal (default type for decimals)
'A' --> character literal
true --> boolean literal
"Harry" --> string literal 
*/

/*public class MAIN {
public static void main(String[] args) {
byte a = 50;
System.out.println(a);
short b = 500;
System.out.println(b);
int hunar = 25;
System.out.println(hunar); 
long number =500000L;
System.out.println(number);
float f1 = 2500000F;
System.out.println(f1);
double d1 = 5000000D;
System.out.println(d1);
char character = 'c';
System.out.println(character);
boolean t = true;
System.out.println(t);
String str = "Hunar";
System.out.println(str);
}  
}*/

//KEYWORDS :- words which are reserved and used by the java compiler. They cannot be used as an identifier

/*
 Reading data from the keyboard  
 In order to read data from the keyboard,java has a scanner class   
 
 scanner class has a lots of method to read the data from the keyboard 
 
 scanner s = new scanner (system.in)

 int a = s.nextInt();
 */

//Ex:- 
/* 
import java.util.Scanner;
public class MAIN{
  public static void main(String[] args) {
      System.out.println("Taking input from the user :-");
      Scanner s = new Scanner(System.in);
  //    System.out.println("Enter number 1");
  //    int a = s.nextInt();
  //    System.out.println("Enter number 2");
  //    int b = s.nextInt();
  //    int sum = a+b;
  //    System.out.println(sum);
  //   System.out.println("Enter float 1");
  //   float f1 = s.nextFloat();
  //   System.out.println("Enter float 2");
  //   float f2 = s.nextFloat();
  //   float sum = f1+f2;
  //   System.out.println(sum);
  //   boolean b1 = s.hasNextInt();
  //   System.out.println(b1);
  //    String str = s.next();
  //    String str = s.nextLine();
  //    System.out.println(str);
  }
}
*/

//EXERCISE 1.1 :- write a program to calculate percentage of a given student in CBSE board exam.His marks from 5 subject must be taken as input from the keyboard (marks are out of 100)
/* 
import java.util.Scanner;
public class MAIN{
  public static void main(String[] args) {
Scanner marks = new Scanner(System.in);
System.out.println("Enter marks of sub1 :- ");
float sub1 = marks.nextFloat();
System.out.println("Enter marks of sub2 :- ");
float sub2 = marks.nextFloat();
System.out.println("Enter marks of sub3 :- ");
float sub3 = marks.nextFloat();
System.out.println("Enter marks of sub4:- ");
float sub4 = marks.nextFloat();
System.out.println("Enter marks of sub5:- ");
float sub5 = marks.nextFloat(); 
//float addition = sub1+sub2+sub3+sub4+sub5;
//float percentage = addition/500;
//System.out.println(percentage*100);
//System.out.println((addition/500)*100);
//System.out.println((((sub1+sub2+sub3+sub4+sub5))/500)*100);
}
}
*/