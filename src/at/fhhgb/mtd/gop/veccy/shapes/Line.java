package at.fhhgb.mtd.gop.veccy.shapes;

public class Line {
    private int x1, y1;
    private int x2, y2;


    public Line(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;


    }

    public Rectangle boundingBox() {
        int width, height;

        width = Math.abs(x1 - x2);
        height = Math.abs(y1 - y2);

        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);

        Rectangle box = new Rectangle(x, y, width, height);
        return box;


    }


}







