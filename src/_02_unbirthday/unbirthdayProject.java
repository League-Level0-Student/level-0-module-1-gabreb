package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthdayProject {
	public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What's your birthday date? answer in eg. 09/06");
	if(answer.equals("04/05")) {
		JOptionPane.showMessageDialog(null, "Have a very happy birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Have a very merry UNbirthday!");
	}
	}
}
