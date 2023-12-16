public class Knight implements ChessPiece {
    private String color;

    public Knight(String color) {
        this.color = color;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Knight moved to " + x + ", " + y);
    }

    @Override
    public void display() {
        System.out.println(color + " Knight displayed");
    }
}