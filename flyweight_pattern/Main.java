public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        ChessPiece blackPawn1 = ChessPieceFactory.getChessPiece("Pawn", "Black");
        ChessPiece blackPawn2 = ChessPieceFactory.getChessPiece("Pawn", "Black");
        ChessPiece whitePawn1 = ChessPieceFactory.getChessPiece("Pawn", "White");
        ChessPiece whitePawn2 = ChessPieceFactory.getChessPiece("Pawn", "White");

        chessBoard.placeChessPiece(blackPawn1, 0, 6);
        chessBoard.placeChessPiece(blackPawn2, 1, 6);
        chessBoard.placeChessPiece(whitePawn1, 0, 1);
        chessBoard.placeChessPiece(whitePawn2, 1, 1);

        blackPawn1.display();
        blackPawn2.display();
        whitePawn1.display();
        whitePawn2.display();

        chessBoard.moveChessPiece(blackPawn1, 0, 6, 0, 5);
        chessBoard.moveChessPiece(whitePawn1, 0, 1, 0, 2);

        blackPawn1.move(0, 5);
        whitePawn1.move(0, 2);

        chessBoard.moveChessPiece(blackPawn2, 1, 6, 1, 5);
        chessBoard.moveChessPiece(whitePawn2, 1, 1, 1, 2);

        blackPawn2.move(1, 5);
        whitePawn2.move(1, 2);

        blackPawn1.display();
        blackPawn2.display();
    }
}