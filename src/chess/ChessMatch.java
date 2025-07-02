package chess;

import boardlayer.Board;
import boardlayer.Position;
import chess.pieces.King;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows();i++) {
			for(int j = 0; j < board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	public void initialSetup() {
		King king = new King(board, Color.BLACK);
		Position position = new Position(7, 3);
		board.placePiece(king, position);
	}
	
}
