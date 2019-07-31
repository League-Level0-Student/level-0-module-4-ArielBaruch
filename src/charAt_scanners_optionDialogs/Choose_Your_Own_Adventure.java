package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class Choose_Your_Own_Adventure {
public static void main(String[] args) {

 int h = JOptionPane.showConfirmDialog(null, "Should Robin knock on somebodies door and take there money");

  if(h == 0) {
   JOptionPane.showMessageDialog(null, "Knock Knock");  
  }

  if(h == 1) {
	  JOptionPane.showMessageDialog(null, "Let's prank batman");
  
	  int d = JOptionPane.showOptionDialog(null, "Should Robin?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] {"Dump Batmans House?", "Toilet Paper Batmans House?"}, null);
	  			
	  if(d == 0) {
		  JOptionPane.showMessageDialog(null, "One day later Batman walks out of his house and a bunch of dump falls on him and realizes a skunk is in the dump");
		  
		  JOptionPane.showMessageDialog(null, "Help Me!!!");
	  }	 
	  if(d == 1) {
		  JOptionPane.showMessageDialog(null, "One day later Batman walks out of his house and a bunch of toilet paper falls on him. he trs to get out and realizes one of the toilet papers are used");
	  
		  JOptionPane.showMessageDialog(null, "Help Me!!!");
	  
		  

	   
	  }
	  
	  System.exit(0);
 
  }

  
  
  int i = JOptionPane.showConfirmDialog(null, "Is the person gonna answer");

  if(i == 0) {
	  JOptionPane.showMessageDialog(null, "Who is it?");
  
	  JOptionPane.showMessageDialog(null, "Robin");

	  JOptionPane.showMessageDialog(null, "Robin who?");

	  JOptionPane.showMessageDialog(null, "Robin your house");

	  JOptionPane.showMessageDialog(null, "Here have the money");
  System.exit(0);
  }
  
  if(i == 1) {
	  JOptionPane.showMessageDialog(null, "Let's prank batman");
	  
	  int d = JOptionPane.showOptionDialog(null, "Should Robin?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] {"Dump Batmans House?", "Toilet Paper Batmans House?"}, null);
	  			
	  if(d == 0) {
		  JOptionPane.showMessageDialog(null, "One day later Batman walks out of his house and a bunch of dump falls on him and realizes a skunk is in the dump");
		  
		  JOptionPane.showMessageDialog(null, "Help Me!!!");
	  }	 
	  if(d == 1) {
		  JOptionPane.showMessageDialog(null, "One day later Batman walks out of his house and a bunch of toilet paper falls on him. he trs to get out and realizes one of the toilet papers are used");
	  
		  JOptionPane.showMessageDialog(null, "Help Me!!!");
	  
		  

	   
	  }
	  
	  System.exit(0);
 
  }
  }
  


}


