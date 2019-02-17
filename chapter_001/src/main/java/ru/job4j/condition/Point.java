package ru.job4j.condition;

/**
 * Distance between two points
 * @author MPestereva
 * @version $Id$
 * @since 0.1
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(2,2);
        double res= a.distanceTo(b);
        System.out.println(res);
    }
}

