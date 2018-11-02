//***********************************************************
// Name:  Anthony Weringer
// Title: Assignment2.java
// Description: Menu with prices
// Time spent: 4 hours
// Date: 8/27/17
// 1. A) True
//    B) False
//    C) True
//    D) True
// 2.
//	import java.util.Scanner;
//	String fName, mName, lName;
//		System.out.println("Please enter first name: ");
//		fName = scan.nextLine();
//		System.out.println("Please enter middle name: ");
//		mName = scan.nextLine();
//		System.out.println("Please enter last name: ");
//		lName = scan.nextLine();
//
//		System.out.println("" + fName  + mName + lName);
//
// 3. Hy
//***********************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment2 
{
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		NumberFormat fm1 = NumberFormat.getCurrencyInstance();

		System.out.println("Welcome to the In-N-Out Burger menu: ");    /*This is the menu and pricing*/
		System.out.println("-----------------------------------------");
		System.out.println("\tHamburger $2.75");
		System.out.println("\tCheeseburger $3.25");
		System.out.println("\tFrench Fries $2.50");
		System.out.println("\tShake & Beverage: $1.50");


		int hamburger, cheeseburger, ff, beverage; /*Where products amounts are stored*/
		double hamburgerTotal, cheeseburgerTotal, ffTotal, beverageTotal; 

		final double HAMBURGER_PRICE = 2.75;   /*Cost of each product*/
		final double CHEESEBURGER_PRICE = 3.25;
		final double FRENCH_FRIES = 2.50;
		final double DRINK_PRICE = 1.50 ;

		System.out.println("\nHow many hamburger(s) would you like to buy? ");   /*Will ask user what they want to order*/
		hamburger = scan.nextInt();
		System.out.print("How many cheeseburger(s) would you like to buy? ");
		cheeseburger = scan.nextInt();
		System.out.print("How many French fries would you like to buy? ");
		ff = scan.nextInt();
		System.out.print("How many drinks would you like to buy? ");
		beverage = scan.nextInt();

		hamburgerTotal = hamburger * HAMBURGER_PRICE; /*Find total cost by multiplying the number of items by the price*/
		System.out.println("The total cost for the hamburger(s) " + fm1.format(hamburgerTotal));

		cheeseburgerTotal = cheeseburger * CHEESEBURGER_PRICE;
		System.out.println("The total cost for the cheeseburger(s) " + fm1.format(cheeseburgerTotal));

		ffTotal = ff * FRENCH_FRIES;
		System.out.println("The total cost for the fries " + fm1.format(ffTotal));

		beverageTotal = beverage * DRINK_PRICE;
		System.out.println("The total cost for the drink(s) " + fm1.format(beverageTotal));

		/*Find total cost by comparing each item*/
		if (hamburgerTotal > cheeseburgerTotal && hamburgerTotal > ffTotal && hamburgerTotal > beverageTotal)


			System.out.println("\nThe hamburgers had the highest total cost.");
			else


	        if (cheeseburgerTotal> ffTotal&&cheeseburgerTotal> hamburgerTotal&&cheeseburgerTotal> beverageTotal)

	        {
				System.out.println("\nThe cheeseburgers had the highest total cost.");
			}
	        else


	        	 if (ffTotal> beverageTotal&&ffTotal> hamburgerTotal&&ffTotal> cheeseburgerTotal)

			 {
	 				System.out.println("\nThe french fries had the highest total cost.");
	 		}
	 	        else


	 	        	 if (beverageTotal> hamburgerTotal&&beverageTotal> cheeseburgerTotal&&beverageTotal> ffTotal)

	 		{
	 					System.out.println("\nThe drinks had the highest total cost.");
	 		}


		System.out.println("\nTotal cost for your order " + fm1.format(hamburgerTotal+cheeseburgerTotal+ffTotal  /*Find the orders total cost*/
	 		    		+beverageTotal));


		System.out.println("\nTotal number of items ordered  " +(hamburger+cheeseburger+ff /*Finding total number of items ordered*/
			    		   +beverage));

	}
}