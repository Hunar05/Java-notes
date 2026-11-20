//CHAPTER 02 - OPERATORS AND EXPRESSION :- 

// operators are used to perform operation on variable and values 

//7 + 11 = 18

// TYPES OF OPERATORS :- 
/*
Arithmetic operators --> +,-,*,/,%,++,--
Assignment operators --> =,+=
comparison operators --> ==,>=,<=
logical operator --> &&,||,!
Bitwise operator --> &,| (operates bitwise)

Arithmetic operator cannot work with booleans 
% operator can work on floats & double 
*/

//Ex:- 
/* 
public class CODING{
  public static void main(String[] args) {
 int a = 100;
 int b = 50;
 System.out.println(a+b);   
 System.out.println(a-b); 
 System.out.println(a*b); 
 System.out.println(a/b); 
 System.out.println(a%b); 
 int c = 50 + b;
 System.out.println(c);
 System.out.println(a==b);
 System.out.println(c==a);
 System.out.println(a>=b);
 System.out.println(c<=b);
 System.out.println(a>=b && c>=b);
 System.out.println(a>=b && b>=c);
 System.out.println(a>=b || b>=c);
 System.out.println(a!=50);  
 System.out.println(a!=100); 
 }
}*/

// PRECEDENCE OF OPERATORS :- The operators are applied and evaluated based on procedence for example (+,-) has less precedence compared to (*,/).Hence * & / are evaluated first 

//In case we like to change this order,we use parenthesis 

//ASSOCIATIVITY :- Asoociativity tells the direction of execution of operators It can either be left to right or right to left 

/*
*,/ --> left to right 
+,- --> left to right 
++, = --> riht to left
 */

 //EX:- 


/*public class CODING {
 public static void main(String[] args) {
  int a = 6*5-34/2;

//Highest precidence goes to * and /. They are than evaluated on the basis of left to right associativity
//30-34/2
//30-17
//= 13
 
int b = 60/5-34*2;

 //12-34*2
 //12-68
 //= -56 
 

 System.out.println(a);
 System.out.println(b);
} 
 }*/

//QUICK QUIZE :- HOW WILL YOU WRITE THE FOLLOWING EXPRESSION IN JAVA ?

//Q1 
/*public class CODING {

  public static void main(String[] args) {
    int x = 8;
    int y = 4;  
    int c = (x-y)/2;
    System.out.println(c);
  }
}*/

//Q2 
/*public class CODING {
public static void main(String[] args) {
  int b =5;
  int a = 2;
  int c = 2;  
  int ans = b*b-4*a*c/(2*a);
  System.out.println(ans);

}
}
*/
//Q3 
/* 
public class CODING{
  public static void main(String[] args) {
    int v = 5;
    int u =3;  
    int ans = v*v-u*u;
    System.out.println(ans);
  }
}
*/
//Q4

/*public class CODING {
public static void main(String[] args) {
  int a = 5;
  int b =2;
  int d = 3;
  int ans = a*b-d;
  System.out.println(ans);
}
}*/

//Resulting data type after arithmetic operation :- 
/*
following table summarize the resulting data types after arithmetic operation on them 

R = byte + short --> int

R = short + int --> int 

R = long + float --> float 

R = int + float --> float 

R = char + int --> int

R = char + short --> int 

R = long + double --> double

R = float + double --> double 
 */

 //EX:- 
 
/*  public class CODING {
 public static void main(String[] args) {
 int i = 500;
 byte b  = 127;
 short s = 50;
 float f = 500.5f;
 long l = 1000l;
 double d = 7.8d;
 char c = 'a';
 
 System.out.println(b+s);
 System.out.println(s+i);
 System.out.println(l+f);
 System.out.println(c+i);
 System.out.println(c+s);
 System.out.println(l+d);
 System.out.println(f+d);
  }
 }
*/
// Increment and decrement operators :- 
/*
a++,++a --> Increment operator  
a--,--a --> decrement operator 

these will operate on all data type execpt booleans 

a++ --> First use the value and then increment 
++a --> first increment the value then use it 
*/

//EX:- 

/*public class CODING {
public static void main(String[] args) {
 int i = 56;
 System.out.println(i);
 int b = i++; //first b is assigned i(56) then i is incresed 
 System.out.println(b);
 int j = 67;
 System.out.println(j);
 int c = ++j; //first j is incremented then c is assigned j(68)
 System.out.println(c); 
}  
}
*/
/*public class CODING {
public static void main(String[] args) {
 int y = 7;
 int x = ++y*8;
 System.out.println(x); 
}  
}*/

/*public class CODING {
public static void main(String[] args) {
    char alphabets = 'a';
    System.out.println(alphabets);
    alphabets++;
    System.out.println(alphabets);
    ++alphabets;
    System.out.println(alphabets);
}
}*/

// EXERCISE 1 SLOUTION BY CODE WITH HARRY :- 
/*import java.util.Scanner;

public class CODING {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int computer = scan.nextInt();

        float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);


    }
}*/

