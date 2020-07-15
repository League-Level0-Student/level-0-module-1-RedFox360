package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import java.util.Random;

import javax.swing.JOptionPane;

/**
// Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		Random r = new Random();
		int low = 10000;
		int high = 99999;
		int auth = r.nextInt(high-low) + low; 
		

	// 1. Set a password in a String variable
	String password = JOptionPane.showInputDialog("Create a passcode");
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
	JOptionPane.showMessageDialog(null, "Your 5-digit Authentication code is " + auth + "");
	
	String secret = JOptionPane.showInputDialog("Write a secret message.");
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
JOptionPane.showMessageDialog(null, "You can only see the secret message if you guess the passcode and authentication code.");
String answer = JOptionPane.showInputDialog("What is the passcode?");
// 4. If their guess matches the password, show them the secret message
if(answer.equals(password))	{
	String auin = JOptionPane.showInputDialog("What is the authentication code?");
	if(auin.equals(auth))	{
	JOptionPane.showMessageDialog(null, "The secret message is \"" + secret + " \"");
	}
else	{
	JOptionPane.showMessageDialog(null, "INTRUDER!!!");
}
}
	// 5. If the password does not match, pop-up "INTRUDER!!"
else	{
	JOptionPane.showMessageDialog(null, "INTRUDER!!!");
}

}
}