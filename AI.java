
public class AI {

	//private int turnNum = 0;
	BoardState board;
	boolean center = false;
	boolean center2 = false;
	boolean center3 = false;
	boolean center4 = false;
	boolean center6 = false;
	boolean center7 = false;
	boolean center8 = false;
	boolean side1 = false;
	boolean side2 = false;
	boolean side3 = false;
	boolean side4 = false;
	boolean oppcorner = false;
	boolean adjcorner1 = false;
	boolean adjcorner2 = false;
	public AI(BoardState board) {
		
		this.board = board;
	}
	
	public int nextMove(int turnNum) {
		if(turnNum == 0) {
			return 9;
		}else if (turnNum == 1) {
			if(board.checkSpot(5, Player.O))
			{
				center = true;
				return 1;
			}
			else if(board.checkSpot(2, Player.O))
			{
				side1 = true;
				return 5;
			}
			else if(board.checkSpot(4, Player.O))
			{
				side2 = true;
				return 5;
			}
			else if(board.checkSpot(6, Player.O))
			{
				side3 = true;
				return 5;
			}
			else if(board.checkSpot(8, Player.O))
			{
				side4 = true;
				return 5;
			}
			else if(board.checkSpot(3, Player.O))
			{
				adjcorner1 = true;
				return 7;
			}
			else if(board.checkSpot(7, Player.O))
			{
				adjcorner2 = true;
				return 3;
			}
			else if(board.checkSpot(1, Player.O))
			{
				oppcorner = true;
				return 7;
			}
		}
		else if(turnNum == 2)
		{
			if((side1 || side2 || side3 || side4) && !board.checkSpot(1, Player.O))
				return 1;
			else if(side1 && !board.checkSpot(3, Player.O))
				return 3;
			else if(side2 && !board.checkSpot(7, Player.O))
				return 7;
			else if(side3 && !board.checkSpot(7, Player.O))
				return 7;
			else if(side4 && !board.checkSpot(3, Player.O))
				return 3;
			else if(side4 && !board.checkSpot(7, Player.O))
				return 7;
			else if(adjcorner1 && !board.checkSpot(8, Player.O))
				return 8;
			else if(adjcorner1 && !board.checkSpot(1, Player.O))
				return 1;
			else if(adjcorner2 && !board.checkSpot(6, Player.O))
				return 6;
			else if(adjcorner2 && !board.checkSpot(1, Player.O))
				return 1;
			else if(oppcorner && !board.checkSpot(8, Player.O))
				return 8;
			else if(oppcorner && !board.checkSpot(3, Player.O))
				return 3;
			else if(center && board.checkSpot(3, Player.O))
			{
				center3 = true;
				return 7;
			}
			else if(center && board.checkSpot(7, Player.O))
			{
				center7 = true;
				return 3;
			}
			else if(center && board.checkSpot(2, Player.O))
			{
				center2 = true;
				return 8;
			}
			else if(center && board.checkSpot(4, Player.O))
			{
				center4 = true;
				return 6;
			}
			else if(center && board.checkSpot(6, Player.O))
			{
				center6 = true;
				return 4;
			}
			else if(center && board.checkSpot(8, Player.O))
			{
				center8 = true;
				return 2;
			}
		}
		else if(turnNum == 3)
		{
			if(side1 && !board.checkSpot(6, Player.O))
				return 6;
			else if(side1 && !board.checkSpot(7, Player.O))
				return 7;
			else if(side2 && !board.checkSpot(3, Player.O))
				return 3;
			else if(side2 && !board.checkSpot(8, Player.O))
				return 8;
			else if(side3 && !board.checkSpot(8, Player.O))
				return 8;
			else if(side3 && !board.checkSpot(3, Player.O))
				return 3;
			else if(side4 && !board.checkSpot(7, Player.O))
				return 7;
			else if(side4 && !board.checkSpot(6, Player.O))
				return 6;
			else if(adjcorner1 && !board.checkSpot(5, Player.O))
				return 5;
			else if(adjcorner1 && !board.checkSpot(4, Player.O))
				return 4;
			else if(adjcorner2 && !board.checkSpot(2, Player.O))
				return 2;
			else if(adjcorner2 && !board.checkSpot(5, Player.O))
				return 5;
			else if(oppcorner && !board.checkSpot(6, Player.O))
				return 6;
			else if(oppcorner && !board.checkSpot(5, Player.O))
				return 5;
			else if(center2 && !board.checkSpot(7, Player.O))
				return 7;
			else if(center2 && !board.checkSpot(3, Player.O))
				return 3;
			else if(center3 && !board.checkSpot(7, Player.O))
				return 7;
			else if(center4 && !board.checkSpot(3, Player.O))
				return 3;
			else if(center4 && !board.checkSpot(7, Player.O))
				return 7;
			else if(center6 && !board.checkSpot(7, Player.O))
				return 7;
			else if(center6 && !board.checkSpot(3, Player.O))
				return 3;
			else if(center7 && !board.checkSpot(3, Player.O))
				return 3;
			else if(center8 && !board.checkSpot(3, Player.O))
				return 3;
			else if(center8 && !board.checkSpot(7, Player.O))
				return 7;
		}
		else if(turnNum == 4)
		{
			if(center2 && !board.checkSpot(3, Player.O))
				return 3;
			else if(center3 && !board.checkSpot(4, Player.O))
				return 4;
			else if(center3 && !board.checkSpot(8, Player.O))
				return 8;
			else if(center7 && !board.checkSpot(2, Player.O))
				return 2;
			else if(center7 && !board.checkSpot(6, Player.O))
				return 6;
			else if(center4 && !board.checkSpot(6, Player.O))
				return 6;
			else if(center6 && !board.checkSpot(2, Player.O))
				return 2;
			else if(center6 && !board.checkSpot(8, Player.O))
				return 8;
			else if(center8 && !board.checkSpot(4, Player.O))
				return 4;
			else if(center8 && !board.checkSpot(6, Player.O))
				return 6;
		}
		else if(turnNum == 5)
		{
			if(center2 && !board.checkSpot(6, Player.O))
				return 6;
			else if(center2 && !board.checkSpot(4, Player.O))
				return 6;
			else if(center4 && !board.checkSpot(8, Player.O))
				return 8;
			else if(center4 && !board.checkSpot(2, Player.O))
				return 2;
		}
		else if(turnNum == 6)
		{
			if(center2 && !board.checkSpot(4, Player.O))
				return 4;
		}
		return 0;
	}
}
