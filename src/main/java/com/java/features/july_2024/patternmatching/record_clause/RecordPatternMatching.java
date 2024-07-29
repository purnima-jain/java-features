package com.java.features.july_2024.patternmatching.record_clause;

record Point(int x, int y) {
}

enum Color {RED, GREEN, BLUE}

record ColoredPoint(Point point, Color color) {
}

record RandomColoredPoint(ColoredPoint coloredPoint) {
}

public class RecordPatternMatching {

    public static void main(String[] args) {
        RecordPatternMatching recordPatternMatching = new RecordPatternMatching();

        Point point = new Point(4, 5);
        System.out.println(recordPatternMatching.beforeRecordPattern(point));
        System.out.println(recordPatternMatching.afterRecordPattern(point));

        // **************************************************

        RandomColoredPoint randomColoredPoint = new RandomColoredPoint(new ColoredPoint(new Point(4, 5), Color.BLUE));
        Color color = recordPatternMatching.getColorOfRandomColoredPoint(randomColoredPoint);
        System.out.println("Color :: " + color);
    }

    public int beforeRecordPattern(Object obj) {
        int sum = 0;

        if (obj instanceof Point p) {
            int x = p.x();
            int y = p.y();

            sum = x + y;
        }

        return sum;
    }

    public int afterRecordPattern(Object obj) {
        int sum = 0;

        if (obj instanceof Point(int x, int y)) { // Java 21 Feature
            sum = x + y;
        }

        return sum;
    }

    private Color getColorOfRandomColoredPoint(Object obj) {
        // if (obj instanceof RandomColoredPoint(ColoredPoint(Point(x, y), Color))) // Compiler Error

        if (obj instanceof RandomColoredPoint(ColoredPoint coloredPoint)) { // Java 21 Feature
            int x = coloredPoint.point().x();
            System.out.println("x :: " + x);
            int y = coloredPoint.point().y();
            System.out.println("y :: " + y);

            return coloredPoint.color();
        }
        return null;
    }

}