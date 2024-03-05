package com.example.triangle;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", Triangle.triangleType(5, 5, 5));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", Triangle.triangleType(5, 5, 6));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", Triangle.triangleType(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", Triangle.triangleType(1, 2, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInput() {
        Triangle.triangleType(-1, 2, 3);
    }
}