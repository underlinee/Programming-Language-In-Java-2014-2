package unit;

import system.Board;
import system.Position;

abstract public class Unit {
	static final int INPUT_MISTAKE = -1;

	public Color color;

	public enum Color{
		 WHITE(1), BLACK(-1);	
		 
		 private int no;
		 private Color(int no){
			 this.no = no;
		 }
		 
		 public int getNo(){
			 return no;
		 }
	}	
		
	public boolean isSameTeam(Position pos) {
		return this.color  == Board.chessBoard.get(pos).color;
	}

	boolean isEmptyPlace(Position pos) {
		return !Board.chessBoard.containsKey(pos);
	}
	
	//INPUT_MISTAKE인 경우는 보드의 범위를 벗어나는 경우
	boolean isValidPos(Position pos) {
		if ((pos.getxPos() != INPUT_MISTAKE) && (pos.getyPos() != INPUT_MISTAKE))
			return true;
		return false;
	}


}