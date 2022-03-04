package chess;

import boardgame.Position;

public class ChessPosition {
	
//class//	
	private char column;
	private int row;

	
//constructor// 
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException ("Error instantiating ChessPosition. Valid values are from a1 to h8. ");
		}
		this.column = column;
		this.row = row;
	}


	
//gets and sets//
	public char getColumn() {
		return column;
	}


	public int getRow() {
		return row;
	}
	
//methods//
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
