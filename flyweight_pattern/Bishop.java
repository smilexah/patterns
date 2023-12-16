public class Bishop implements ChessPiece {
    private String color;

    public Bishop(String color) {
        this.color = color;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Bishop moved to " + x + ", " + y);
    }

    @Override
    public void display() {
        System.out.println(color + " Bishop displayed");
    }
}