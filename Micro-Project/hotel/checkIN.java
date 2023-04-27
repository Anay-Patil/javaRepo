package hotel;
import java.util.*;
public class checkIN
{
	public void single_room()
	{
		int adhar;
		String name,add,ref_id;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your reference id (Alphanumeric)");
		ref_id = sc.next();
		System.out.println("Enter your name:");
		name = sc.next();
		System.out.println("Enter your Address:");
		add = sc.next();
		System.out.println("Enter Valid Adhar number");
		adhar = sc.nextInt();
		
		System.out.println("Hello "+name+" your Single Room is almost booked! Please confirm your transaction. Your Transaction ID: ACRAF23DB3C4");
		System.out.println("Total Price (incl taxes): Rs.12000");
		System.out.println("Thank-You for Choosing the Hyatt Regency, we provide the best.");
		
	}
	
	public void deluxe_room()
	{
		int adhar;
		String name,add,ref_id;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your reference id (Alphanumeric)");
		ref_id = sc.next();
		System.out.println("Enter your name:");
		name = sc.next();
		System.out.println("Enter your Address:");
		add = sc.next();
		System.out.println("Enter Valid Adhar number");
		adhar = sc.nextInt();
		
		System.out.println("Hello "+name+" your Deluxe Room is almost booked! Please confirm your transaction. Your Transaction ID: TQRAF49XC3C4");
		System.out.println("Total Price (incl taxes): Rs.17000");
		System.out.println("Thank-You for Choosing the Hyatt Regency, we provide the best.");
		
	}
	
	public void suite()
	{
		int adhar;
		String name,add,ref_id;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your reference id (Alphanumeric)");
		ref_id = sc.next();
		System.out.println("Enter your name:");
		name = sc.next();
		System.out.println("Enter your Address:");
		add = sc.next();
		System.out.println("Enter Valid Adhar number");
		adhar = sc.nextInt();
		
		System.out.println("Hello "+name+" your Suite is almost booked! Please confirm your transaction. Your Transaction ID: ACRAF23DB3C4");
		System.out.println("Total Price (incl taxes): Rs.20000");
		System.out.println("Thank-You for Choosing the Hyatt Regency, we provide the best.");	
	}
	
	public void pre_suite()
	{
		String adhar;
		String name,add,ref_id;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your reference id (Alphanumeric)");
		ref_id = sc.next();
		System.out.println("Enter your name:");
		name = sc.next();
		System.out.println("Enter your Address:");
		add = sc.next();
		System.out.println("Enter Valid Adhar number");
		adhar = sc.next();
		
		System.out.println("Hello "+name+" your Presidential Suite is almost booked! Please confirm your transaction. Your Transaction ID: ACRAF23DB3C4");
		System.out.println("Total Price (incl taxes): Rs.37000");
		System.out.println("Thank-You for Choosing the Hyatt Regency, we provide the best.");	
	}
	
	
}