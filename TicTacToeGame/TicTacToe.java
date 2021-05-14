package TicTacToeGame;

public class TicTacToe {
	//Initial UI
	//| - | - | - |
	//-------------
	//| - | - | - |
	//-------------
	//| - | - | - |
	

	//Actual representation
	//| 0 | 1 | 2 |
	//-------------
	//| 3 | 4 | 5 |
	//-------------
	//| 6 | 7 | 8 |
	
	
	//User's representation
	//| 1 | 2 | 3 |
	//-------------
	//| 4 | 5 | 6 |
	//-------------
	//| 7 | 8 | 9 |
	
	//GAMED
	//| - | - | - |
	//-------------
	//| 0 | X | X |
	//-------------
	//| 0 | 0 | - |
		

	
	protected char [] board;
	protected char userMarker;
	protected char aiMarker;
	protected char currentMarker;
	protected char winner;
	
	TicTacToe (char aiMarker,char playerMarker){
		this.userMarker = playerMarker;
		this.aiMarker = aiMarker;
		this.winner = '-';
		this.board = setBoard();
		
	}
	
	// create an empty board
	public char [] setBoard() {
		char [] board = new char[9];
		for ( int i = 0; i < board.length;i++) {
			board[i]= '-';
		}	
		return board;	
	}
	
	
	public boolean playTurn(int spot) {
		boolean isValid = withinRange(spot) && !isSpotTaken(spot);
		if (isValid) {
			board[spot-1]= currentMarker;
			// check whom turn it is. if it is userMarker then next is aiMarker and visa versa
			currentMarker = currentMarker == userMarker ? aiMarker: userMarker;
		}
		
		return isValid;
		
	}
	//check if our spot within the range
	public boolean withinRange(int spot) {
		return (spot > 0 || spot < board.length+1)? true: false;
		
	}
	
	// check if spot is taken or empty
	public boolean isSpotTaken(int spot){
		return board[spot]== '-'? false: true;
	}
	
	public boolean isThereWinner() {
		boolean diagonalsAndMiddles = rightDi()|| leftDi() || middleRow()|| secondCol();
		boolean parallelTop = topRow() || leftCol();
		boolean parallelBottom = bottomRow() || rightCol();
		if (diagonalsAndMiddles) {
			this.winner = board[4];
			
		}else if (parallelTop) {
			this.winner = board[0];
			
		}else if (parallelBottom) {
			this.winner = board[8];
		}
			return diagonalsAndMiddles || parallelTop || parallelBottom;
	}
	
	public boolean rightDi() {
		return (board[0]== board [4] && board [4]== board [8])? true: false;
	}
	
	public boolean leftDi() {
		return (board[2]== board[4]&&  board [4]==board [6])? true: false;
	}
	
	public boolean middleRow() {
		return (board[3]==board [4]&& board [4]== board [5])? true: false;
	}
	public boolean secondCol() {
		return (board[1]== board [4]&& board [4]== board [7])? true: false;
	}
	public boolean topRow() {
		return (board[0]== board [1] &&  board [1]== board [2])? true: false;
	}
	public boolean leftCol() {
		return (board[0]== 'X'&& board [3]=='X'&& board [6]=='X')||(board[0]== '0'&& board [3]=='0'&& board [6]=='0')? true: false;
	}
	
	public boolean bottomRow() {
		return (board[6]== 'X'&& board [7]=='X'&& board [8]=='X')||(board[6]== '0'&& board [7]=='0'&& board [8]=='0')? true: false;
	}
	public boolean rightCol() {
		return (board[2]== 'X'&& board [5]=='X'&& board [8]=='X')||(board[2]== '0'&& board [5]=='0'&& board [8]=='0')? true: false;
	}
	
	// check if there is any available spot
	public boolean isBoardFilled() {
		for ( int i = 0; i < board.length;i++) {
			if (board[i]=='-') {
				return false;
			}
		}
		return true;
	}
	 public String gameOver() {
		 boolean didSomeoneWin = isThereWinner();
		 if (didSomeoneWin) {
			 return "We have a winner! Winner is "+ this.winner + "'s";
					 
		 }else if ( isBoardFilled()) {
			 return "Draw, Game Over";
		 } else {
			 return "Game is NOT OVER";
		 }
	 }
	
	
	
	
	// board for user
	public void displayBoard() {
		for ( int i = 1; i <=9 ; i++) {
			System.out.print("| "+ i+ " ");
			
			if ( i ==3 || i ==6) {
				System.out.print("|");
				System.out.println();
				System.out.println("-------------");
			}	
		}
		System.out.print("|");
				
	}
	

	

}
