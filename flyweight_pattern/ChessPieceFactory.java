import java.util.*;

class ChessPieceFactory {
    private static Map<String, ChessPiece> chessPieces = new HashMap<>();

    public static ChessPiece getChessPiece(String type, String color) {
        String key = type + color;
        ChessPiece chessPiece = chessPieces.get(key);

        if (chessPiece == null) {
            switch (type) {
                case "Pawn":
                    chessPiece = new Pawn(color);
                    break;
                case "Rook":
                    chessPiece = new Rook(color);
                    break;
                case "Knight":
                    chessPiece = new Knight(color);
                    break;
                case "Bishop":
                    chessPiece = new Bishop(color);
                    break;
                case "Queen":
                    chessPiece = new Queen(color);
                    break;
                case "King":
                    chessPiece = new King(color);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid chess piece type: " + type);
            }

            chessPieces.put(key, chessPiece);
        }

        return chessPiece;
    }
}