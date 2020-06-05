import java.util.Scanner;

public class RandomCoin {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int Choice;
		
		System.out.println("Choose the coin side 0=Front 1=Back");
		Choice = input.nextInt();
		
		int randomNum = (int)(Math.random()*2);
		if(randomNum == 0) {
			System.out.println("Front Side");
		}
		else {
			System.out.println("Back Side");
		}
		if(Choice == randomNum) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}
	}
}
