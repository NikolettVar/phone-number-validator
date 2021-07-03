/*
*MobileApp.java
*18 11 2020
*N Varadi
*/

import javax.swing.*;

public class MobileApp{
	public static void main(String args[]){

		String repeat;
		repeat = "";

		String number;
		String validity;

		Mobile myMobile = new Mobile();

		do{

		number = JOptionPane.showInputDialog(null, "Please enter your mobile number");

		myMobile.setNumber(number);

		myMobile.compute();

		validity = myMobile.getValidity();

		JOptionPane.showMessageDialog(null, "Your mobile number is: " + validity);
		repeat = JOptionPane.showInputDialog(null, "Would you like to check another mobile number? If so, please type: Yes ");
		}
		while(repeat.equalsIgnoreCase("Yes"));
	}
}