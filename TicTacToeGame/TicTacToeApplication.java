package TicTacToeGame;
import java.util.Scanner;

public class TicTacToeApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean doYouWantToPlay = true;
		while(doYouWantToPlay) {
			System.out.println("Welcome to Tic Tac Toe! You are about to play agains"
					+ "the computer.Are you ready?I hope so! \n BUT FIRST , you "
					+" must select a character you want to be and which character I will be!");
			
			System.out.println();
			System.out.println("Enter a single character that will represent you on the board");
			char playerToken = sc.next().charAt(0);
			System.out.println("Enter a single character that will represent your opponent on the board");
			char opponentToken = sc.next().charAt(0);
			TicTacToe game = new TicTacToe(opponentToken,playerToken);
			
					
			
		}
		
	}

}
