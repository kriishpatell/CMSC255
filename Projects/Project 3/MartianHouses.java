import java.util.Scanner; 

public class MartianHouses 
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in); 

        do{
            System.out.println("Enter the settlers name:");
            String name = scr.nextLine(); 
            System.out.println("Enter the length of a side of the house:");
            double length = scr.nextDouble(); 
    
            double areaFloor, areaOuter, areaTotal, costTotal;

            areaFloor = 2 * Math.pow(length, 2) * (1 + Math.sqrt(2)); 
            areaOuter = 8 * 12 * length;
            areaTotal = (areaFloor * 2) + areaOuter;

            costTotal = areaTotal * 14.50; 
            
            System.out.printf(name + " has a house surface area of %,.2f", + areaTotal);
            System.out.printf(" and cost of $%,.2f", costTotal);

            System.out.println();
            System.out.println("Would you like to enter another house? Enter no to exit.");

            scr.nextLine();  
        }while(!scr.nextLine().trim().equalsIgnoreCase("no")); 
    }    
}
