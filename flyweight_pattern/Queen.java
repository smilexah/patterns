public class Queen implements ChessPiece {
    private String color;

    public Queen(String color) {
        this.color = color;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Queen moved to " + x + ", " + y);
    }

    @Override
    public void display() {
        System.out.println(color + " Queen displayed");
    }
}