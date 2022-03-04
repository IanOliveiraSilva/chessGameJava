package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
//class//
	private Color color;

//constructor//	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

//gets and sets//
	public Color getColor() {
		return color;
	}

	
	
}
