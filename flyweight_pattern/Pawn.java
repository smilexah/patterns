public class Pawn implements ChessPiece {
    private String color;

    public Pawn(String color) {
        this.color = color;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Pawn moved to " + x + ", " + y);
    }

    @Override
    public void display() {
        System.out.println(color + " Pawn displayed");
    }
}
