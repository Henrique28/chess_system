package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {			
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source");
			ChessPosition source = UI.ReadChessPosition(sc);					

			System.out.println();
			System.out.println("target");
			ChessPosition target = UI.ReadChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.PerformChessMove(source, target);
		}
	}
}
