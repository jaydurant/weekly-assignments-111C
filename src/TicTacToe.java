import java.util.Arrays;

public class TicTacToe {
	private char[][] board = new char[3][3];
	private char currentUsersTurn = 'X';
	private boolean isWinner = false;
	private int countOfBoardSpaces = 9; 
	private int lastInsertedRow;
	private int lastInsertedCol;
	
	public boolean addMove(int row, int column) {
		--row;
		--column;
		boolean moveMade = false;
		
		if(row > -1 && row < 3 && column > -1  && column < 3 ) {
			
			if(board[row][column] != 'X' && board[row][column] != 'O') {
				board[row][column] = currentUsersTurn;
				lastInsertedRow = row;
				lastInsertedCol = column;
				//change users turn 
				countOfBoardSpaces--;
				
				moveMade = true;
			}else {
				System.out.println("Please select another col and row");
			}
		} else {
			System.out.println("Row and Col are outside the bounds of the board");
		}
		
		return moveMade;
		
	}
	
	public void displayBoard() {
		for(int i = 0 ; i < board.length; i++ ) {
			for(int y = 0; y < board[i].length ; y++) {
				if(board[i][y] != 'X' && board[i][y] != 'O' ) {
					System.out.print('*');
				}else {
					System.out.print(board[i][y]);
				}
				
			}
			System.out.print("\n");
		}
	}
	
	public char returnTurnOfUser() {
		return  currentUsersTurn;
	}
	
	public boolean determineIfWinner() {
		int count = 0;
		char userChar = board[lastInsertedRow][lastInsertedCol];
		
		//check horizontal row
		for(int i = 0;i < board[lastInsertedRow].length; i++) {
			if(board[lastInsertedRow][i] == userChar) {
				count++;
			}else {
				count = 0;
				break;
			}
		}
		
		//check vertical
		for(int y = 0; y < board.length && count != 3 ; y++) {
			if(board[y][lastInsertedCol] == userChar) {
				count++;
			}else {
				count = 0;
				break;
			}
		}
		
		//check diagonally left to right
		for(int z = 0; z < board.length && count != 3; z++) {
			if(board[z][z] == userChar) {
				count++;
			}else {
				count = 0;
				break;
			}
		}
		
		//check diagonally right to left;
		for(int r = board.length - 1, c = 0;r > -1  && count != 3; r-- , c++) {
			if(board[r][c] == userChar) {
				count++;
			}else {
				count = 0;
				break;
			}
		}
		
		
		if(count == 3) {
			isWinner = true;
			return isWinner;
		}
		
		return isWinner;
	}
	
	public void displayWinner() {
		if(isWinner) {
			System.out.println("Player: "+ currentUsersTurn + " is the winner");
		}
	}
	
	public void resetGame() {
		board = new char[3][3];
		isWinner = false;
		currentUsersTurn = 'X';
		countOfBoardSpaces = 9;
		System.out.println("Game Reset");
	}
	
	public void changeUsersTurn() {
		if(currentUsersTurn == 'X') {
			currentUsersTurn = 'O';
		}else{
			currentUsersTurn = 'X';
		}
	}
	
	public boolean continueGame() {
		if(countOfBoardSpaces  > 0) {
			return true;
		}
		return false;
	}
}
