public class King implements ChessPiece {
    private String color;

    public King(String color) {
        this.color = color;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("King moved to " + x + ", " + y);
    }

    @Override
    public void display() {
        System.out.println(color + " King displayed");
    }
}