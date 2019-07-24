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
  }

  int i = JOptionPane.showConfirmDialog(null, "Is the person gonna answer");

  if(i == 0) {
	  JOptionPane.showMessageDialog(null, "Who is it?");
  }
  
  JOptionPane.showMessageDialog(null, "Robin");

  JOptionPane.showMessageDialog(null, "Robin who?");

  JOptionPane.showMessageDialog(null, "Robin your house");

 







}













}
