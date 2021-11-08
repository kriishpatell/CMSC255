import java.util.Scanner;

public class MiddleString 
{
    public static void main(String [] args) 
    {
        Scanner scnr = new Scanner(System.in);
  
        System.out.println("Enter three strings:");
        String str1 = scnr.next(); //abc
        String str2 = scnr.next(); //def
        String str3 = scnr.next(); //ghi

        if((str1.compareTo(str2) >= 0 && str2.compareTo(str3) >= 0) || (str3.compareTo(str2) >= 0 && str2.compareTo(str1) >= 0))
        {
            System.out.println(str2);
        }   
        else if((str2.compareTo(str1) >= 0 && str1.compareTo(str3) >= 0) || (str3.compareTo(str1) >= 0 && str1.compareTo(str2) >= 0))
        {
            System.out.println(str1);
        }
        else if((str1.compareTo(str3) >= 0 && str3.compareTo(str2) >= 0) || (str2.compareTo(str3) >= 0 && str3.compareTo(str1) >= 0))
        {
            System.out.println(str3);
        }
    }
}
