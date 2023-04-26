import hotel.*;
import java.io.*;
import java.util.*;


public class MicroP
{
	public static void main(String args[])
	{
		
   }
}
	
class Main extends checkIN implements checkOUT
{
	public void checkout()
	{
		
	}
	
	public void extend_stay()
	{
		
	}

	public void menu()
	{
		int ch;
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("1)Check-In\n2)Check-Out\n3)Exit")
		System.out.print("\nEnter Your Choice:");
		ch = sc.nextInt();
		
		switch(ch)
		{
			case 1: switch1();
			break;
			case 2:
			break;
		  //case 3:
	      //break;
		}
	}
	public void switch1()
	{
		Scanner sc = new Scanner();
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
}
