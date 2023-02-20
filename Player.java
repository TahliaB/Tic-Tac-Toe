import java.util.Scanner;

public class Player {

	public static final int X = 1;
	public static final int O = 2;
	Scanner scan;
	private int playerState;
	private BoardState board;
	private AI ai;
	private boolean isPlayerAI;
	
	public Player(int playerState, BoardState board, boolean isPlayerAI, Scanner scan) {
		
		this.playerState = playerState;
		this.board = board;
		this.scan = scan;
		setPlayerAI(isPlayerAI);
		if(isPlayerAI) {
			
			ai = new AI(board);
		}
	}
	


	public boolean isPlayerAI() {
		return isPlayerAI;
	}



	public void setPlayerAI(boolean isPlayerAI) {
		this.isPlayerAI = isPlayerAI;
	}



	public int getPlayerState() {
		return playerState;
	}

	public void setPlayerState(int playerState) {
		this.playerState = playerState;
	}
	
	public void placeMarker(int position) {
		
		
		board.updateBoard(playerState, position);
	}
	
	public int getInput(int turnNum) {
		
		if(isPlayerAI) {
			
			return ai.nextMove(turnNum);
		} else {
			
			return scan.nextInt();
		}
	}


}
