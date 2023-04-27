// 
import hotel.*;
import java.io.*;
import java.util.*;


public class MicroP
{
	public static void main(String args[])
	{
		
		Main project = new Main();
		project.menu();
	}
}
	
class Main extends checkIN implements checkOUT
{
	public void menu()
	{
		int ch;
		do{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===================================");
		System.out.println("***********HYATT REGENCY***********");
		System.out.println("===================================");
		System.out.println("1)Check-In\n2)Check-Out\n3)Exit");
		System.out.print("\nEnter Your Choice:");
		ch = sc.nextInt();
		
		switch(ch)
		{
			case 1: switch1();
			break;
			case 2: switch2();
			break;
			case 3: System.out.println("Thank-You for consulting HYATT REGENCY, BANGALORE");
		}
		}while(ch!=3);
	}
	public void switch1()
	{
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("1)Single Room\n2)Deluxe Room\n3)Suite\n4)Presidential Suite\n5)Previous Menu");
		System.out.println("Enter Your choice:");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1: single_room();
			break;
			case 2: deluxe_room();
			break;
			case 3: suite();
			break;
			case 4: pre_suite();
			break;
			case 5: menu();
			default: System.out.println("Invalid symbol.");
		}
	}
	public void switch2()
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("1)Final Checkout\n2)Extend Your Stay\n3)Go Back");
		System.out.println("\nEnter your choice:");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1: checkout();
			break;
			case 2: extend_stay();
			break;
			case 3: menu();
			default: System.out.println("Enter Valid Choice");
		}
	}
	public void checkout()
	{
		int id;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Booking ID(numeric):");
		id = sc.nextInt();
		System.out.println("Thank-You for being a wonderful customer. We've checked you out. Have a good day!");
		System.out.println("Your reference ID: "+id);
	}
	public void extend_stay()
	{
		Scanner sc = new Scanner(System.in);
		int days,id;
		System.out.println("Enter your Booking ID (numeric):");
		id = sc.nextInt();
		System.out.println("Enter the number of days you want to extend:");
		days = sc.nextInt();
		System.out.println("Thank You, your stay has been extended for "+days+" days");
		System.out.println("Kindly complete the transaction through our payment gateway.");
	}
}
