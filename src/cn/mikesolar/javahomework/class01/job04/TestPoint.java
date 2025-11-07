/**
 * TestPoint.java
 */

package cn.mikesolar.javahomework.class01.job04;

public class TestPoint {

    public static void main(String[] args) {
        Point point = new Point();
        point.setX(1.0);
        point.setY(1.0);
        Point point2 = new Point();
        point2.setX(2.0);
        point2.setY(2.0);

        System.out.println(point.toString());
        System.out.println("("+point2.getX()+","+point2.getY()+")");

        System.out.println("Distance is"+point.distance(point2));
    }

}
