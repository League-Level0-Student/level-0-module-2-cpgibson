package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTicket {

	
	public static void main (String[] args) {
		
		Random randomMaker = new Random();
		int randomNumber0 = randomMaker.nextInt(100 + 1 -1);
		int randomNumber1 = randomMaker.nextInt(100 + 1 -1);
		int randomNumber2 = randomMaker.nextInt(100 + 1 -1);
		int randomNumber3 = randomMaker.nextInt(100 + 1 -1);
		int randomNumber4 = randomMaker.nextInt(100 + 1 -1);
		int randomNumber5 = randomMaker.nextInt(100 + 1 -1);
		JOptionPane.showMessageDialog(null, "These next six numbers are the lottery numbers; did you win?");
			JOptionPane.showMessageDialog(null, randomNumber0 + ", "+ randomNumber1 + ", " + randomNumber2 + ", " + randomNumber3 + ", " + randomNumber4 + ", " + randomNumber5);
		
		
		
	}
}
