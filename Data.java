package Data;

//An exploration of primitive data types.
class Data {
	
   private static Boolean flag;

//Declares and uses variables of various types.
   public static void main(String[] args) {
               int num1 = 40, num2 = 65, x = 99;
               float num3 = 18.53f;
               char letter = 'x';
               int a =777;
               num1= a;
               double num4 = a;
               flag = false;
               int FIXED = 2020;
               int FIXED2 = 3030;
               FIXED = FIXED2;
            		             		                  
               System.out.println("The value of num1: " + num1);
               System.out.println("The value of num3: " + num3);
               System.out.println("The value of x: " + x);
               System.out.println("The letter x: " + letter);
               System.out.println("num4 is : " + num4);
               System.out.println("FIXED is : " + FIXED);
    } // method main
} // class Data