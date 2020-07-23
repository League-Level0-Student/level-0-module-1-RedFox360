package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * // Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	public static void main(String[] args) {
		Random r = new Random();
		int auth = r.nextInt(999999 - 100000) + 100000;
		String auin = "" + auth + "";
		int math1 = r.nextInt(9999 - 2) + 2;
		int math2 = r.nextInt(9999 - 2) + 2;
		int answermath = math1 * math2;
		String answermathst = "" + answermath + "";
		String password = JOptionPane.showInputDialog("Create a passcode");
		JOptionPane.showMessageDialog(null, "Your 6-digit Authentication code is " + auth + "");
		String secret = JOptionPane.showInputDialog("Write a secret message.");
		JOptionPane.showMessageDialog(null, 
"You can only see the secret message if you guess the password, authentication code, math problem, the Prime Minister of Cameroon, and how to say 'yellow' in Latin.");
		String answer = JOptionPane.showInputDialog("What is the password?");
		if (answer.equals(password)) {
			String answer2 = JOptionPane.showInputDialog("What is the authentication code?");
			if (answer2.equals(auin)) {
				String answermathin = JOptionPane.showInputDialog("What is " + math1 + " times " + math2 + "");
				if (answermathin.equals(answermathst)) {
					String cameroon = JOptionPane.showInputDialog("Who is the Prime Minister of Cameroon");
					if (cameroon.equalsIgnoreCase("Joseph Ngute")) {
						String yellow = JOptionPane.showInputDialog("How do you say yellow in Latin?");
						if (yellow.equalsIgnoreCase("Flavo")) {
							JOptionPane.showMessageDialog(null, "The secret message is \""+secret+" \"");
							} else { in(); }} else { in(); }} else { in(); }} else { in(); }} else { in(); } }
	static void in()	{
		JOptionPane.showMessageDialog(null, "INTRUDER!!!");
	}
	}
