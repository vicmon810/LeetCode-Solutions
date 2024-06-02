import java.util.Scanner;// import the Scanner class
/**a class to print number which user enter*/
public class MyTools{
   private  Scanner scanner = new Scanner(System.in);
   public static void main (String[]arges){
      //called with prompt parameter
      int a = readInt("Enter your int now:");
      System.out.println("You entered " + a);
      
      double b = readDouble("Enter your double now:");
      System.out.println("You entered " + b);
      
      String c = readToken("Enter your string now:");
      System.out.println("You entered " + c);
      
      String d = readLine("Enter your string now:");
      System.out.println("You entered " + d);
   
   }
   /**a method that print int number
     @param prompt number that we adding up to
     @return  the int entered by the user
*/
   public static int readInt(String prompt){
      Scanner scanner = new Scanner(System.in);
      System.out.print(prompt + "\n");
      return scanner.nextInt();
   
     
   }
   /** Method to read a double from user input with a given prompt
     @param prompt number that we adding up to
     @return  the double entered by the user
   */
   public static double readDouble(String prompt){
      Scanner scanner = new Scanner(System.in);
      System.out.print(prompt +"\n");
      return scanner.nextDouble();
   }
   /** Method to read a token (word) from user input with a given prompt
     @param prompt world that we adding up to
     @return the String entered by the user

   */
   public static String  readToken(String prompt){
      Scanner scanner = new Scanner(System.in);
      System.out.print(prompt + "\n");
      return scanner.next();
   }

      /** Takes a string which is printed as a prompt to the user and 
      returns the int that they enter
      @param prompt instructions to the user
      @return the int entered by the user.
   */
   public static String  readLine(String prompt){
      Scanner scanner = new Scanner(System.in);
      System.out.print(prompt + "\n");
      return scanner.nextLine();
   }

}