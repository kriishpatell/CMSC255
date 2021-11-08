import java.util.Scanner;

public class Lab7 {
  
   public static void main(String[] args) {
  
     String title;
     String firstName;
     String lastName;
     Scanner in = new Scanner(System.in);

     System.out.print("Enter a title:");
     title = in.next();
     System.out.print("Enter your first name:");
     firstName = in.next();
     System.out.print("Enter a your last name:");
     lastName = in.next();
     
     greeting(title, firstName, lastName);

     int number1;
     int number2;
     
     System.out.print("Enter first number:");
     number1 = in.nextInt();
     System.out.print("Enter second number:");
     number2 = in.nextInt();
     

     System.out.println("The largest number is " + max(number1, number2));
     System.out.println("The sum of the numbers is " + sumTo(number1, number2));
 }


 public static void greeting(String title, String firstName, String lastName)
 {
     System.out.println();
     System.out.println("Dear " + title + " " + firstName + " " + lastName + ",");
     System.out.println();
 }

  public static int max(int num1, int num2)
  {
      return Math.max(num1, num2);
  }

  public static int sumTo(int num1, int num2)
  {
      int sum = 0;

      if (num1 < num2) {
          while (num1 <= num2) {
              sum = sum + num1;
              num1++;
          }
      } else {
          while (num2 <= num1) {
              sum = sum + num2;
              num2++;
          }
      }
      return sum;
  }
}
