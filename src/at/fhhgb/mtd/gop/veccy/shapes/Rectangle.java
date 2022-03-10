package at.fhhgb.mtd.gop.veccy.shapes;

public class Rectangle {
    private int x, y;
    private int width, height;
    private Point topLeft;
    private Point bottomRight;


    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    public Rectangle boundingBox(Rectangle other) {
        Rectangle rectangle = new Rectangle(other.x, other.y, other.width, other.height);

        return rectangle;
    }

    public int area() {
        return this.width * this.height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean coordCheck(Rectangle rectangle) {
        return x == rectangle.x && y == rectangle.y && width == rectangle.width && height == rectangle.height;
    }

    public boolean isOverlapping(Rectangle other) {
        return (Math.abs(x + width / 2) - (other.getX() + other.getWidth() / 2) * 2 < (width + other.width)) &&
                (Math.abs(y + height / 2) - (other.getY() + other.getHeight() / 2) * 2 < (height + other.height));
    }

}


