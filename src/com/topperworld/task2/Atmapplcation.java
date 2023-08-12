package com.topperworld.task2;
import java.util.Scanner;
public class Atmapplcation {
	public static void main(String[] args) {
				int balance =0,withdraw,deposite;
				Scanner scanner =new Scanner(System.in);
				while(true) {
					System.out.println("             ATM Machine              ");
					System.out.println("       Choose 1 for withdraw           ");
					System.out.println("       Choose 2 for deposit            ");
					System.out.println("       Choose 3 for check balance      ");
					System.out.println("       Choose 4 for exit               ");
					int choice =scanner.nextInt();
					switch(choice) {
					case 1:
					System.out.println("enter money to withdraw");
					// get the withdraw money from users 
					withdraw =scanner.nextInt();
				   if(balance>=withdraw) {
					   balance =balance-withdraw;
					   System.out.println("please collect your money");
					   }
				   else {
					   System.out.println("insufficient balance");
					   System.out.println("");
					   break;
				   }
					   case 2:
						   System.out.print(" enter money to be deposited :");
						   deposite =scanner.nextInt();
						   balance =balance + deposite;
						   System.out.println("your money has been successfully deposited");
						   System.out.println("");
						   break;	   
					   case 3:
						   System.out.println(" balance : " + balance);
					}
				}
		  }
	}

