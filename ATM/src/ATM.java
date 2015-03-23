/* Program to perform Basic ATM operation */

import java.util.Scanner;								

public class ATM 
{

		public static void main(String[] args)
	{
		int pin=8796,choice;									/* Assumed Initially PIN AND BALANCE IS PRESNT*/
		double balance=10000.00,amount;
		
		System.out.println("Enter you choice as 1 or 2");
		System.out.println("1.To withdraw cash \n2.To check Current Balance\n");
		Scanner in = new Scanner(System.in);
		choice = in.nextInt();
		
		switch(choice)
		{
		case 1:	try
			{	
				System.out.println("enter the pin");
				pin = in.nextInt();						
				if(pin==8796)
				{
					System.out.println("enter the amount");
					amount=in.nextDouble();
					if( amount < balance && amount >= 0 )			/* Checking if enough balance and valid amount entered */
					{
						balance = balance-amount;
					}
					else
					{
						System.out.println("insufficient balance !!!");
					}
			
					System.out.println("Balance is "+balance);
				}
				else
				{
					System.out.println("wrong pin !!");
				}
				
			}
			catch(Exception e)											/* For Error Caused By Wrong Type Of Input */
				{
				System.out.println("Input is Not Number !");	
				}
					break;
		case 2: System.out.println("Balance is "+balance);
					break;
		default : System.out.println("Wrong Choice Entered !");
		}
		}
		  	
}
		



