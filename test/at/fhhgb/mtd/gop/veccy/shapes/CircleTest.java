package at.fhhgb.mtd.gop.veccy.shapes;

import org.junit.jupiter.api.Test;

import javax.crypto.CipherInputStream;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    public void testCircleArea() {                   // lest die Area aus dem Circle.java aus!
        Circle circle = new Circle(0, 0, 8);
        assertEquals(192, circle.area());
        assertNotEquals(0, circle.area());

    }

    @Test
    public void testBoundingBox() {
        Circle circle = new Circle(0, 0, 20);
        Rectangle newRectangle = new Rectangle(-20,-20,40,40);
        assertTrue(circle.boundingBox().coordCheck(newRectangle));

    }

    @Test
    public void testOverlap() {
        Circle circle = new Circle(0, 0, 10);
        Rectangle newRectangle = new Rectangle(-10,-10,20,20);
        assertTrue(circle.boundingBox().isOverlapping(newRectangle));
    }
}