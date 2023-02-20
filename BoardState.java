
public class BoardState {

	int[][] boardState;
	int turnState = Player.X;
	boolean hasSomeoneWon = false;
	
	public BoardState() {
		
		boardState = new int[3][3];
		
		for(int i = 0; i < boardState.length; i++) {
			
			for(int j = 0; j < boardState[0].length; j++) {
				
				boardState[i][j] = 0;
			}
		}
	}
	
	public void updateBoard(int playerState, int position) {
		
		
		
		if(position == 1) {
			
			if(boardState[0][0] == 0) {
				
				boardState[0][0] = playerState;
			} else {
				
				System.out.println("Please place again.");
				changeTurn();

			}
		} else if(position == 2) {
			
			if(boardState[0][1] == 0) {
				
				boardState[0][1] = playerState;
			} else {
				
				System.out.println("Please place again.");
				changeTurn();

			}
		} else if(position == 3) {
			
			if(boardState[0][2] == 0) {
				
				boardState[0][2] = playerState;
			} else {
				
				System.out.println("Please place again.");
				changeTurn();
			}
		} else if(position == 4) {
			
			if(boardState[1][0] == 0) {
				
				boardState[1][0] = playerState;
			} else {
				
				System.out.println("Please place again.");
				changeTurn();

			}
		} else if(position == 5) {
			
			if(boardState[1][1] == 0) {
				
				boardState[1][1] = playerState;
			} else {
				
				System.out.println("Please place again.");
				changeTurn();

			}
		} else if(position == 6) {
			
			if(boardState[1][2] == 0) {
				
				boardState[1][2] = playerState;
			} else {
				
				System.out.println("Please place again.");
				changeTurn();

			}
		} else if(position == 7) {
			
			if(boardState[2][0] == 0) {
				
				boardState[2][0] = playerState;
			} else {
				
				System.out.println("Please place again.");
				changeTurn();

			}
		} else if(position == 8) {
			
			if(boardState[2][1] == 0) {
				
				boardState[2][1] = playerState;
			} else {
				
				System.out.println("Please place again.");
				changeTurn();

			}
		} else if(position == 9) {
			
			if(boardState[2][2] == 0) {
				
				boardState[2][2] = playerState;
			} else {
				
				System.out.println("Please place again.");
				changeTurn();

			}
		}
		
		changeTurn();
	}
	
	public void changeTurn() {
		
		if(turnState == Player.O) {
			
			turnState = Player.X;
		} else {
			
			turnState = Player.O;
		}
	}
	
	public boolean checkWin(int playerState) {
		
		boolean state = false;
		
		for(int i = 0; i < 3; i++) {
			
			if(checkRow(i, playerState)) {
				
				state = true;
				System.out.println("Row " + (i + 1) + " is filled.");
			}
			
			if(checkColumn(i, playerState)) {
				
				state = true;
				System.out.println("Column "+ (i + 1) + " is filled.");
			}
		}
		
		if(checkFirstDiagonal(playerState)) {
			
			state = true;
			System.out.println("The first diagonal is filled.");
		}
		
		if(checkSecondDiagonal(playerState)) {
			
			state = true;
			System.out.println("The second diagonal is filled.");
		}
		
		
		hasSomeoneWon = state;
		return state;
	}
	
	public boolean checkDraw()
	{
		boolean state = true;
		
		for(int i = 0; i < boardState.length; i++)
		{
			for(int j = 0; j < boardState[0].length; j++)
			{
				if(boardState[i][j] == 0) {
					state = false;
				}
			}
		}
		hasSomeoneWon = state;
		return state;
	}
	public boolean checkSpot(int position, int playerState) {
		
		if(position == 1) {
			
			if(boardState[0][0] == playerState) {
				//System.out.println(playerState + "1player");
				return true;
			} 
			
		} else if(position == 2) {
			
			if(boardState[0][1] == playerState) {
				//System.out.println(playerState + "2player");
				return true;
			} 
			
		} else if(position == 3) {
			
			if(boardState[0][2] == playerState) {
				//System.out.println(playerState + "3player");
				return true;
			} 
			
		} else if(position == 4) {
			
			if(boardState[1][0] == playerState) {
				//System.out.println(playerState + "4player");
				return true;
			} 
			
		} else if(position == 5) {
			
			if(boardState[1][1] == playerState) {
				//System.out.println(playerState + "5player");
				return true;
			} 
			
		} else if(position == 6) {
			
			if(boardState[1][2] == playerState) {
			//	System.out.println(playerState + "6player");
				return true;
			} 
		} else if(position == 7) {
			
			if(boardState[2][0] == playerState) {
				//System.out.println(playerState + "7player");
				return true;
			} 
			
		} else if(position == 8) {
			
			if(boardState[2][1] == playerState) {
				//System.out.println(playerState + "8player");
				return true;
			} 
			
		} else if(position == 9) {
			
			if(boardState[2][2] == playerState) {
				//System.out.println(playerState + "9player");
				return true;
			} 
		} 
		
		return false;
	}
	
	public boolean checkRow(int row, int playerState) {
		
		boolean state = true;
		
		for(int i = 0; i < 3; i++) {
			
			if(boardState[row][i] != playerState) {
				
				state = false;
			}
		}
		
		return state;
	}
	
	
	
	public boolean checkColumn(int column, int playerState) {
		
		boolean state = true;
		
		for(int i = 0; i < 3; i++) {
			
			if(boardState[i][column] != playerState) {
				
				state = false;
			}
		}
		
		return state;
	}
	
	public boolean checkFirstDiagonal(int playerState) {
		
		boolean state = true;
		
		for(int i = 0; i < 3; i++) {
			
			if(boardState[i][i] != playerState) {
				
				state = false;
			}
		}
		
		return state;
	}
	
	public boolean checkSecondDiagonal(int playerState) {
		
		if(boardState[0][2] == playerState && boardState[1][1] == playerState && boardState[2][0] == playerState) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	public void printBoard() {
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				if(boardState[i][j] == 0) {
					
					System.out.print("   ");
				} else if(boardState[i][j] == 1) {
					
					System.out.print(" X ");
				} else if(boardState[i][j] == 2) {
					
					System.out.print(" O ");
				}
				
				if(j < 2) {
					
					System.out.print( "|");
				}
			}
			
			if(i < 2) {
				
				System.out.println("\n------------");
			}
		}
		
		System.out.println();
	}
}
