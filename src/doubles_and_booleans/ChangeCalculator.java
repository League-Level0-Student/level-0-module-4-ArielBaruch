package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String a = JOptionPane.showInputDialog(null, "How many nickles do you have?");

//Convert their answer to an int using Integer.parseInt()
int b=Integer.parseInt(a);		


		// Ask the user how many dimes they have, and convert their answer
String c = JOptionPane.showInputDialog("How many dimes do you have?");

int d = Integer.parseInt(c);

// Ask the user how many quarters they have, and convert their answer

String e = JOptionPane.showInputDialog("How many quarters do you have?");

int f = Integer.parseInt(e); 

// Calculate how much money the user has and save it in a double variable 

double dollars = d/10 + b/20 + f/4; 

		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "you have " + dollars + " dollars");
	}
}

