package TicTacToeGame;
import java.util.Scanner;

public class TicTacToeApplication {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		boolean doYouWantToPlay = true;
		while(doYouWantToPlay) {
			// Setting up tokens
			System.out.println("Welcome to Tic Tac Toe! You are about to play agains"
					+ "the computer.Are you ready?I hope so! \n BUT FIRST , you "
					+" must select a character you want to be and which character I will be!");
			
			System.out.println();
			System.out.println("Enter a single character that will represent you on the board");
			char playerToken = sc.next().charAt(0);
			System.out.println("Enter a single character that will represent your opponent on the board");
			char opponentToken = sc.next().charAt(0);
			TicTacToe game = new TicTacToe(opponentToken,playerToken);
			
			AI ai = new AI();

			System.out.println();
			System.out.println("Now we can display a board where you can select an index you wish to put your token");
			
			
			TicTacToe.displayIndexBoard();
			
			while (game.gameOver().equals("Game is NOT OVER")) {
				if ( game.currentMarker== game.userMarker) {
					//User turn
					System.out.println("It's your turn! Enter a pot for your token");
					int input = sc.nextInt();
					while(!game.playTurn(input)) {
						System.out.println("Try again. "+ input +" is invalid.This spot is already taken"
								+ " or it is out of range");
						input=sc.nextInt();
					}
					System.out.println("You selected "+ input + " !");
					
				}else {
					//AI Turn
					System.out.println("It is my turn!");
					//Pick spot
					int aiSpot = ai.pickSpot(game);
					game.playTurn(aiSpot);
					System.out.println(" I picked "+ aiSpot +" !");
				}
				game.printBoard();
			}
			
			
					
			System.out.println(game.gameOver());
		}
		
	}
