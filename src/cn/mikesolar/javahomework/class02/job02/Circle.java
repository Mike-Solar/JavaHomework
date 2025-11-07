package cn.mikesolar.javahomework.class02.job02;

public class Circle extends Shape {

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle() {
        super();
        r = 0;
    }

    public Circle(double r) {
        super();
        this.r = r;
    }

    public Circle(double r, String color, boolean isFilled) {
        super(color, isFilled);
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle [r=" + r + ", color=" + color + ", isFilled=" + isFilled + "]";
    }
}
