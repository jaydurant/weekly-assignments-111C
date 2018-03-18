import java.util.*;
public class TicTacToeClient {

	public static void main(String[] args) {
		boolean playGame = true;
		
		Scanner input = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		System.out.println("Play a new game of TicTacToe");
		do {
			System.out.println("User: " + game.returnTurnOfUser() + " please enter a row and column to place your symbol");
			
			//display board
			game.displayBoard();
			
			//allow user to 
			boolean madeTurn = false;
			do {
				System.out.println("row and col must be between 1 and 3");
				System.out.println("row: ");
				int row = input.nextInt();
				System.out.println("col: ");
				int col = input.nextInt();
				madeTurn = game.addMove(row, col);
			}while(!madeTurn);
			
			game.displayBoard();
			boolean isThereWinner = game.determineIfWinner();
			
			if(isThereWinner) {
				game.displayWinner();
				System.out.println("Would you like to play again? y/n");
				if(input.next().equals("y")) {
					game.resetGame();
				}else {
					playGame = false;
				}
			}
			
			else if(!game.continueGame()) {
				System.out.println("There are no more spaces left. Would you like to play again? y/n");
				if(input.next().equals("y")) {
					game.resetGame();
				}else {
					playGame = false;
				}
			}else {
				game.changeUsersTurn();
			}
			
			
		}while(playGame);

	}

}
