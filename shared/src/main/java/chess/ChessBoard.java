
package chess;

public class ChessGame {
    public ChessGame() { /* compiled code */ }

    public chess.ChessGame.TeamColor getTeamTurn() { /* compiled code */ }

    public void setTeamTurn(chess.ChessGame.TeamColor team) { /* compiled code */ }

    public java.util.Collection<chess.ChessMove> validMoves(chess.ChessPosition startPosition) { /* compiled code */ }

    public void makeMove(chess.ChessMove move) throws chess.InvalidMoveException { /* compiled code */ }

    public boolean isInCheck(chess.ChessGame.TeamColor teamColor) { /* compiled code */ }

    public boolean isInCheckmate(chess.ChessGame.TeamColor teamColor) { /* compiled code */ }

    public boolean isInStalemate(chess.ChessGame.TeamColor teamColor) { /* compiled code */ }

    public void setBoard(chess.ChessBoard board) { /* compiled code */ }

    public chess.ChessBoard getBoard() { /* compiled code */ }

    public static enum TeamColor {
        WHITE, BLACK;

        private TeamColor() { /* compiled code */ }
    }
}
