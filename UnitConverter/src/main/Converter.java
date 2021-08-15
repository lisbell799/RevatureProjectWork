
package main;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		//creating the int variable and scanner
		
		int menuSelection;
		Scanner sc = new Scanner(System.in);
		
		
		//do-while loop too keep going until user quits
		
		
		do {
			//print out the menu
			System.out.println("Please select an option: ");
			System.out.println("1. Pounds to Stones");
			System.out.println("2. Pounds to Ounces");
			System.out.println("3. Pounds to Kilograms");
			System.out.println("4. Quit");
			
			menuSelection = sc.nextInt();
			
			switch(menuSelection) {
			case 1: PoundstoStones();
					break;
			case 2: PoundstoOunces();
					break;
			case 3: PoundstoKilograms();
					break;
			}
			
		}while(menuSelection != 4);
		
		if(menuSelection == 4) {
			System.out.println("Quitting program now.");
		}
		
		sc.close(); //closes the scanner

	
		   }
	//case 1: pounds to stones
	public static void PoundstoStones() {
		//ask for user input
		System.out.println("Please enter the number of pounds.  ");
		//instantiate the scanner
		Scanner sc = new Scanner(System.in);
		int pounds;
		//take input and store it in pound variable
		pounds = sc.nextInt();
		//number of stones in a pound 
		int stones = (pounds/14);
		System.out.println(stones);
		
		

	}
	//case 2: pounds to ounces
	public static void PoundstoOunces() {
		//ask for user input
		System.out.println("Please enter the number of pounds.  ");
		//instantiate the scanner
		Scanner sc = new Scanner(System.in);
		int pounds;
		//take input and store it in pound variable
		pounds = sc.nextInt();
		//number of stones in a pound 
		int ounces = (pounds*16);
		System.out.println(ounces);	
	}
	//case 3: pounds to kilograms
	public static void PoundstoKilograms() {
		//ask for user input
		System.out.println("Please enter the number of pounds.  ");
		//instantiate the scanner
		Scanner sc = new Scanner(System.in);
		int pounds;
		//take input and store it in pound variable
		pounds = sc.nextInt();
		//number of stones in a pound 
		double kilo = (pounds/2.205);
		System.out.println(kilo);
	}
}

