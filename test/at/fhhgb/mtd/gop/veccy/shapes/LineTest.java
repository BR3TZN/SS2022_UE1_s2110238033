package at.fhhgb.mtd.gop.veccy.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    @Test
    public void testLineBoundingBox() {
        Line line = new Line(2, 4, 5, 8);
        Rectangle rectangle = new Rectangle(2, 4, 3, 4);
        assertTrue(rectangle.coordCheck(line.boundingBox()));

    }
    @Test
    public void testOverlap(){
        Line line = new Line(2, 4, 5, 8);
        Rectangle rectangle = new Rectangle(0,0,50,20);
        assertTrue(rectangle.isOverlapping(line.boundingBox()));
    }
}