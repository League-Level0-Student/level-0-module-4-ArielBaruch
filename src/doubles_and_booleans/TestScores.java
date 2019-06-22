package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	
String a = JOptionPane.showInputDialog("What is your test score?");
	
 double b = Double.parseDouble(a);

if(b > 60 && b <= 100) {
	JOptionPane.showMessageDialog(null, "Nice Job");
}

if(b > 0 && b <= 59) {
	JOptionPane.showMessageDialog(null,"Better luck studing next time");
}

}



}
