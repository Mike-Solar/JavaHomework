/**
 * Cuboid.java
 */

package cn.mikesolar.javahomework.class01.job02;

public class Cuboid {

    private double width;
    private double height;
    private double depth;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }

    public Cuboid(){
        this.width = 0.0;
        this.height = 0.0;
        this.depth = 0.0;
    }

    public Cuboid(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double surface(){
        return width*height*2+height*depth*2+width*depth*2;
    }
    
    public double volume(){
        return width*height*depth;
    }

}
