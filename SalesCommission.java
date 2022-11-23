package salescommission;  //@author Justin Little
import java.util.Scanner;
public class SalesCommission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double item, totalitem = 0, grosspay;
        double itemcount = 0, commission = 0.09, weekly = 200.00;
        
        System.out.println("Sales Commission Calculator");
        System.out.print("Enter the value of a item sold or -1 to end: ");
        item = input.nextDouble();
        
    while (item != -1)
    {
        totalitem = totalitem + item;
        itemcount = itemcount + 1;
        System.out.print("Enter the value of the next item sold or -1 to end: ");
        item = input.nextDouble();
    }
    if (itemcount != 0)
    {
        grosspay = (totalitem * commission) + weekly;
        System.out.printf("Your earnings for the week are: $%.2f%n", grosspay);
    }
    }
    }
    
    

