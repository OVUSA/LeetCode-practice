
public class TicTacToe {
 
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
  
   //Initial UI
	//| - | - | - |
	//-------------
	//| - | - | - |
	//-------------
	//| - | - | - |
	
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
