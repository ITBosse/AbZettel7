package Adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class test {
    @Test
    public void AdapterTest() {
        LegacyTriangle triangle = new LegacyTriangle(
                new LegacyPoint(0.0, 0.0),
                new LegacyPoint(1.0, 0.0),
                new LegacyPoint(0.0, 1.0)
        );
        TriangleAdapter triangleAdapter = new TriangleAdapter(triangle);

        assertEquals(0.0, triangleAdapter.getxPos(), 0.1);
        assertEquals(0.0, triangleAdapter.getyPos(), 0.1);

        assertEquals(0.5, triangleAdapter.getArea(), 0.1);

        triangleAdapter.shift(1.0, 1.0);
        assertEquals(1.0, triangle.pointA().getxPos(), 0.1);
        assertEquals(1.0, triangle.pointA().getyPos(), 0.1);
        assertEquals(2.0, triangle.pointB().getxPos(), 0.1);
        assertEquals(1.0, triangle.pointB().getyPos(), 0.1);
        assertEquals(1.0, triangle.pointC().getxPos(), 0.1);
        assertEquals(2.0, triangle.pointC().getyPos(), 0.1);

        triangleAdapter.scale(2.0);
        assertEquals(1.0, triangle.pointA().getxPos(), 0.1);
        assertEquals(1.0, triangle.pointA().getyPos(), 0.1);
        assertEquals(3.0, triangle.pointB().getxPos(), 0.1);
        assertEquals(1.0, triangle.pointB().getyPos(), 0.1);
        assertEquals(1.0, triangle.pointC().getxPos(), 0.1);
        assertEquals(3.0, triangle.pointC().getyPos(), 0.1);
    }
}
