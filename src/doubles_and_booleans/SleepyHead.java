package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */

 int weekend = JOptionPane.showConfirmDialog(null, "Is it a weekend?", "Sleepy Head", JOptionPane.YES_NO_OPTION);  
  
  int Vacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleep in", JOptionPane.YES_NO_OPTION);  

       if(weekend==1) {
    	   isWeekday=true;
       }
       else {
    	   isWeekday=false;
       }
       
       
       if(Vacation==1) {
    	   isVacation=false;
       }
       else {
    	   isVacation=true;
       }
       
      if(isVacation || !isWeekday) {
    	  System.out.println("Sleep in");
      } 
      
      if(isWeekday && !isVacation) {
    	  System.out.println("Get up lazybones!");
      }
   
      
       /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
