package at.fhhgb.mtd.gop.veccy.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(0, 0, 20, 50);
        assertEquals(1000, rectangle.area());
        assertNotEquals(0, rectangle.area());

    }
    @Test
    public void testBoundingBox(){
        Rectangle rectangle = new Rectangle(0,0,50,20);
        assertEquals(1000, rectangle.boundingBox(rectangle).area());
    }
    @Test
    public void testOverlap(){
        Rectangle rectangle = new Rectangle(0,0,50,20);
        assertTrue(rectangle.isOverlapping(rectangle.boundingBox(rectangle)));
    }

}