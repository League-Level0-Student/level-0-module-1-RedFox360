package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
//What can travel around the world while staying in a corner?
String riddle1a = JOptionPane.showInputDialog("What can travel the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle1a.equalsIgnoreCase("a stamp"))	{
	JOptionPane.showMessageDialog(null, "You got it correct!");
score+=1;
}
else	{
	JOptionPane.showMessageDialog(null, "WRONG, the correct answer was \"a stamp\".");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String riddle2a = JOptionPane.showInputDialog("What starts with a T, ends with a T, and is filled with T?");
if(riddle2a.equalsIgnoreCase("a teapot"))	{
	JOptionPane.showMessageDialog(null, "You got it correct!");
	score+=1;
}
else	{
	JOptionPane.showMessageDialog(null, "WRONG, the correct answer was \"a teapot\".");
}
String riddle3a = JOptionPane.showInputDialog("What has to be broken before you can use it?");
if(riddle3a.equalsIgnoreCase("an egg"))	{
	JOptionPane.showMessageDialog(null, "You got it correct!");
	score+=1;
}
else	{
	JOptionPane.showMessageDialog(null, "WRONG, the correct answer was \"an egg\".");
}
String riddle4a = JOptionPane.showInputDialog("What has many keys but cannot open a single lock?");
if(riddle4a.equalsIgnoreCase("a piano"))	{
	JOptionPane.showMessageDialog(null, "You got it correct!");
	score+=1;
}
else	{
	JOptionPane.showMessageDialog(null, "WRONG, the correct answer was \"a piano\".");
}
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "Your final score is " + score + "");
		
	}
}
