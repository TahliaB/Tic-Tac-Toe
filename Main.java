// Tahlia Bergeron and Ethan Scrivner

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1 if you would like to play against the computer or enter 2 if you would like to play with a friend:");
		int input = scan.nextInt();
		boolean isAi = false; 
		if(input == 1)
		{
			isAi = true;
		}
		BoardState board = new BoardState();
		Player XPlayer = new Player(Player.X, board, isAi, scan);
		Player OPlayer = new Player(Player.O, board, false, scan);
		AI computer;
		
		
		
		
		
		while(!board.hasSomeoneWon && !XPlayer.isPlayerAI()) {
			
			int position = 0;
			if(board.turnState == Player.X) {
				
				System.out.println("Its X's turn.");
				position = XPlayer.getInput(0);
			} else {
				
				System.out.println("Its O's turn.");
				position = OPlayer.getInput(0);
			}
			
			board.updateBoard(board.turnState, position);
			board.printBoard();
			
			if(board.checkWin(Player.O))
			{
				System.out.println("Player O has won.");
			}
			else if(board.checkWin(Player.X))
			{
				System.out.println("Player X has won.");
			}
			else if(board.checkDraw())
				System.out.println("It is a tie.");
		}
		int turnNum = 0;
		while(!board.hasSomeoneWon && XPlayer.isPlayerAI()) {
			
			int position = 0;
			if(board.turnState == Player.X) {
				
				System.out.println("Its the AI's turn.");
				if(XPlayer.getInput(turnNum) != 0)
				{
					position = XPlayer.getInput(turnNum);
					turnNum++;
				}
			} else {
				if(!board.checkDraw()) {
					System.out.println("Its your turn.");
					position = OPlayer.getInput(0);
				}
			}
			
			board.updateBoard(board.turnState, position);
			board.printBoard();
			
			if(board.checkWin(Player.O))
			{
				System.out.println("You have won.");
			}
			else if(board.checkWin(Player.X))
			{
				System.out.println("The computer has won.");
			}
			else if(board.checkDraw())
				System.out.println("It is a tie.");
		}
	}
}
