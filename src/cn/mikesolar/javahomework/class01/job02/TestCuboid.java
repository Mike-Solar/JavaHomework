/**
 * TestCuboid.java
 */

package cn.mikesolar.javahomework.class01.job02;

public class TestCuboid {

    public static void main(String[] args) {
        Cuboid cuboid=new Cuboid();
        cuboid.setWidth(2.0);
        cuboid.setHeight(2.0);
        cuboid.setDepth(2.0);

        System.out.println("x="+cuboid.getWidth()+",y="+cuboid.getHeight()+",z="+cuboid.getDepth());
        System.out.println("surface="+cuboid.surface()+",volume="+cuboid.volume());

        Cuboid cuboid1=new Cuboid(2.0,2.5,3.0);
        System.out.println("x="+cuboid1.getWidth()+",y="+cuboid1.getHeight()+",z="+cuboid1.getDepth());
        System.out.println("surface="+cuboid1.surface()+",volume="+cuboid1.volume());

    }
}
