package boardgame;

public abstract class Piece {
	
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
	
//methods//
	public abstract boolean[][] possibleMoves();
	
	public boolean possiblemove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
