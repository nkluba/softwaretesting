package com.example.triangle;

public class Triangle {

    public static String triangleType(int a, int b, int c) {
        if (a < 1 || a > 200 || b < 1 || b > 200 || c < 1 || c > 200) {
            throw new IllegalArgumentException("Invalid input values. Sides must be between 1 and 200.");
        }

        if (!(a < b + c && b < a + c && c < a + b)) {
            return "NotATriangle";
        }

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
