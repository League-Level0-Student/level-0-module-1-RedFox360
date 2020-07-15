package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		
	//1.Ask the user for their birthday (mm/dd), e.g. 06/09 
String bday = JOptionPane.showInputDialog("What is your birthday (mm/dd)");
	//2.If it matches today's date, wish them a happy birthday 
if(bday.equals("07/15"))	{
JOptionPane.showMessageDialog(null, "The LEAGUE wishes you a very happy birthday");
}
	//3.otherwise, wish them a very merry UNbirthday 
else	{
	JOptionPane.showMessageDialog(null, "The Mad Hatter wishes you a merry UNbirthday");
}
	}
}
