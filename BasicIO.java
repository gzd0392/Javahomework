package BasicIO;

import java.time.LocalDateTime;
import java.util.*;


// An exploration of basic input and output.
class BasicIO {
  // Reads and processes string input.
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    // get first input
    System.out.println("Enter your name: ");
    System.out.println("Enter your age: ");
    System.out.println("Enter your hight: ");
    String name = stdin.nextLine();
    String age = stdin.nextLine();
    String hight = stdin.nextLine();
    int age1 =  Integer.parseInt(age);
    // display output on console
    System.out.println("your name is " + name);
    System.out.println("your age(days) is " + age1 * 365 );
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.printf("%s now %s is %s high",dateTime,name,hight);
	
    
  } // method main
} // class BASIC_IO