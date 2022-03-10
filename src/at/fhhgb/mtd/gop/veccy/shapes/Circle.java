package at.fhhgb.mtd.gop.veccy.shapes;

public class Circle {
    private int x, y;
    private int radius;


    public Circle(int x, int y, int radius) {      // bestimmung der Werte des Kreises
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int area() {
        return (int) Math.PI * radius * radius;
    } // Fläche des Kreises Berechnet

    public Rectangle boundingBox() {

        int x = getX() - radius;
        int y = getY() - radius;
        int width = radius * 2;
        int height = radius * 2;

        Rectangle rectangle = new Rectangle(x, y, width, height);

        return  rectangle;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}

