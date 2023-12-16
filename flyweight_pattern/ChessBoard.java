public class ChessBoard {
    ChessPiece[][] squares;

    public ChessBoard() {
        this.squares = new ChessPiece[8][8];
    }

    public void placeChessPiece(ChessPiece chessPiece, int x, int y) {
        squares[x][y] = chessPiece;
    }

    public void moveChessPiece(ChessPiece chessPiece, int fromX, int fromY, int toX, int toY) {
        if (squares[fromX][fromY] == chessPiece) {
            squares[fromX][fromY] = null;
            squares[toX][toY] = chessPiece;
        } else {
            throw new IllegalArgumentException("Invalid chess piece");
        }
    }
}
