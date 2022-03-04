package boardgame;

public class Piece {
	
//class//	
	protected Position position;
	private Board board;
	
//constructor//
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	
//gets and sets//
	protected Board getBoard() {
		return board;
	}

}
