public class Rook implements ChessPiece {
    private String color;

    public Rook(String color) {
        this.color = color;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Rook moved to " + x + ", " + y);
    }

    @Override
    public void display() {
        System.out.println(color + " Rook displayed");
    }
}