//Chapter 3 - Strings:-

/*A String is a sequence of Characters

A String is instantiated as follows:

String name:
name = new String("Harry");

String is a class but can be used like a data type: [ Strings are immutabia and cannot be changed]

string name = "Harry"; 
*/

/*public class CODING{
public static void main(String[] args) {
  String name = new String("Harry");
  System.out. println(name);
}
}*/

/*public class CODING{
public static void main(String[] args){
String name = "Harry";
System.out.println(name);
}
}*/

/*Different ways to print in java :-

we can use the following ways to print in java:

(1) System.out.print() ------> No newline at the end!

(2) System.out.println() -----> Prints a newline at the end

(3) system.Out.printf()

(4) system.out.format()

      System.Out.Printf("%c", Ch)
                            %d for int
                            %f for float
                            %c for char
                            %s for string 
*/

/*import java.util.Scanner;
public class CODING{
    public static void main(String[] args) {
         String name = "Hunar";
        System.out.println(name);
        int a = 6;
        float b = 5.2578f;
        System.out.printf("The value of a is %d and value of b is %f \n", a, b);
        System.out.printf("The value of a is %d and value of b is %.2f \n", a, b);
        System.out.printf("The value of a is %d and value of b is %8.2f \n", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
      //  String st = sc.nextLine();
        System.out.println(st);
}
}*/


// String methods :- String methods operate on java strings. They can be used to find length of thhe strings,convert to lowercase, etc.

/*

 some of the commonly used string methods are 

 string name = "Harry";

 (1)name.length() --> Returns length of string name (s in this case)

 (2)name.toLowercase() --> retuns a new string which has all the lower case characters from the string name   

 (3)name.toUppercase() --> returns a new string which has all the uppercase characters from the string name

 (4)name.trim() --> returns a new string after removing all the leading and trating space from the original strting 

 (5)name.substring(int start) --> returns a substring from start to the end. name.substring(3) returns "ry"[Note that index starts from 0]

 (6)name.substring(int start,int end) --> returns a substring from start index to the end index. start index is include and end is excluded
 
 (7)name.replace('r','p') --> returns a new string after replacing r with p. Happy is returned in this case.

 (8)name.startwith("Ha") --> returns true if name start with "Ha". true in this case!

 (9)name.endwith("ry") ---> returns true if the name ends with string "ry". true in this case

 (10)name.charAt(2) --> returns characters at a given index position. r in this case 

 (11)name.indexof(s) --> returns the index of the given strings.for ex : name.indexof("ar") returns 1 which is the first occurence of ar in string "Harry", -1 otherwise

 (12)name.indexof("s",3) --> returns the index of the given string starting from the index 3(int). -1 is returened in this case!

 (13)name.lastindexof("r") --> returns the last index of the given strings. 3 in this case! 

 (14)name.lastindexof("r",2) --> returns the last index of the given string before index 2

 (15)name.equal("Harry") --> returns true if the given string is equal to "Harry" false otherwise.[case sensitive]

 (16)name.equualignorecase("Harry") --> returns true if two strings are equal ignoring the case of characters.
*/

//Ex:- 

/*public class CODING {
public static void main(String[] args) {
    String name = "Harry";
    // printing out string :- 
    System.out.println(name);
    //Using string methods :- 

    //(1)using name.length() :- 
    //int value = name.length();
    //System.out.println(value);
    //System.out.println(name.length());
   
    //(2)Using name.toLowercase():- 
    //String lowerstring = name.toLowerCase();
    //System.out.println(lowerstring);
    //System.out.println(name.toLowerCase());

    //(3)Using name.touppercase():-
    //String upperstring = name.toUpperCase();
    //System.out.println(upperstring); 
    //System.out.println(name.toUpperCase());

    //(4)Using name.trim():- 
    //String Non_trimmed_string = "      HARRY        ";
    //System.out.println(Non_trimmed_string);
    //String Trimmed_string = Non_trimmed_string.trim();
    //System.out.println(Trimmed_string);
    //System.out.println(Non_trimmed_string.trim());

    //(5)Using name.Substring(int start):- 
    //System.out.println(name.substring(2));

    //(6)Using name.Substring(int start,int end):-
    //System.out.println(name.substring(1,4));

    //(7)Using name.replace():-
    //System.out.println(name.replace('r','p'));
    //System.out.println(name.replace("rry","ier"));
    //System.out.println(name.replace("r","ier"));

    //(8)Using name.startswith("Ha"):- 
    //boolean start = name.startsWith("Ha");
    //System.out.println(start);
    //System.out.println(name.startsWith("Ha"));

    //(9)Using name.endswith("ry"):-
    //boolean ends = name.endsWith("ry");
    //System.out.println(ends);
    //System.out.println(name.endsWith("ry"));

    //(10)Using name.charAt(2):-
    //char findchar = name.charAt(2);
    //System.out.println(findchar);
    //System.out.println(name.charAt(2));

    //(11)Using name.indexof(r):-
    //int findpos = name.indexOf("r");
    //System.out.println(findpos);
    //System.out.println(name.indexOf("r"));

    //(12)Using name.indexOf("r",3):-
    //String modifiedString = "Harryrry";
    //int findspecificpos01 = modifiedString.indexOf("r",3);
    //System.out.println(findspecificpos01);
    //System.out.println(modifiedString.indexOf("r",3));
    //int findspecificpos02 = modifiedString.indexOf("rry",4);
    //System.out.println(findspecificpos02);
    //System.out.println(modifiedString.indexOf("rry",3));

    //(13)Using name.lastindexOf("r"):-
    //int findpos2 = name.lastIndexOf("r");
    //System.out.println(findpos2);
    //System.out.println(name.lastIndexOf("r"));
  
    //(14)Using name.lastindexof("r",2):-
    //String modifiedString2 = "Harryrryrry";
    //int findspecificpos03 = modifiedString2.lastIndexOf("r",7);
    //System.out.println(findspecificpos03);
    //System.out.println(modifiedString2.lastIndexOf("r",4));
    //int findspecificpos04 = modifiedString2.lastIndexOf("rry",7);
    //System.out.println(findspecificpos04);
    //System.out.println(modifiedString2.lastIndexOf("rry",3));

    //(15)Using name.equal("Harry"):- 
    //boolean check01 = name.equals("Harry");
    //System.out.println(check01);
    //System.out.println(name.equals("Harry"));

    //(16)Using name.equalIgnoreCase("hARRY"):-
    //boolean check02 = name.equalsIgnoreCase("hARRY");
    //System.out.println(check02);
    //System.out.println(name.equalsIgnoreCase("HARRY"));
  }  
}*/

//Escape sequence characters :- sequence of characters after backslash '\' = Escape sequence characters 
/*
 Escape sequence characters consists of more than one characters but represents one character when used within the strings
 
 Ex:- \n,\t,\',\\,etc.

 ESCAPE SEQUENCES :- 

 (1)\t :- Insert a tab in the text at this point 
 
 (2)\b :- Insert a backspace in the text at this point 
 
 (3)\n :- Insert a newline in the text at this point 

 (4)\r :- Insert a carriage returns in the text at this point 

 (5)\f :- Insert a form feed in the text at this point 

 (6)\' :- Insert a single quote characters in the text at this point 

 (7)\" :- Insert a double quote characters in the text at this point 

 (8)\\ :- Insert a backslash characters in the text at this point 
*/

//practice :- 

/*public class CODING {
public static void main(String[] args) {
    //System.out.println("this Ecsape sequence insert a tab \t at this point");
    //System.out.println("This ecscape sequence insert a backspace\b in the text at this point");
    //System.out.println("This escape sequence characters insert a new line \n in the text at this point");
    //System.out.println("This escape sequence characters insert a carriage returns \r in the text at this point");
    //System.out.println("This escape sequence characters insert a form feed \f in the text at this point  ");
    //System.out.println("This escape sequence insert a single quote characters \'in the text at this point\'");
    //System.out.println("This escape sequence characters insert a double quote characters \"in the text at this point\"");
    //System.out.println("This escape sequence characters insert a backslash characters \\ in the text at this point");
}
}*/

