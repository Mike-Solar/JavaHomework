/**
 * Point.java
 */

package cn.mikesolar.javahomework.job04;

public class Point {

    private double x;
    private double y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(Point point){
        double dx = x - point.x;
        double dy = y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
