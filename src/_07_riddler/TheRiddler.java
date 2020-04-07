package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What is greater than God,\r\n" + 
		"more evil than the devil,\r\n" + 
		"the poor have it,\r\n" + 
		"the rich need it,\r\n" + 
		"and if you eat it, you'll die?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equalsIgnoreCase("nothing")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score = score + 1; 
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong! The answer was nothing!"); 
}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("What is as light as a feather, but even the world's \r\n strongest man couldn't hold it for more than a minute?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer2.equalsIgnoreCase("his breath")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score = score + 1; 
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong! The answer was his breath!"); 
}
String answer3 = JOptionPane.showInputDialog("What tastes better than it smells?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer3.equalsIgnoreCase("a tongue")) {
JOptionPane.showMessageDialog(null, "correct!");
score = score + 1; 
}
// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "wrong! The answer was a tongue!"); 
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}

