package cn.mikesolar.javahomework.class02.job02;

public class Shape {

    protected String color;
    protected boolean isFilled;

    public Shape() {
        this.color = "#FFFFFF";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color.toUpperCase();
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.toUpperCase();
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Empty Shape";
    }
}
