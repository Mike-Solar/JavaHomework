package cn.mikesolar.javahomework.class02.job02;

public class PolymorphicTest {

    public static void testPolymh(Shape shape){
        if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle);
            System.out.println(rectangle.area());
            System.out.println(rectangle.perimeter());
        }
        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            System.out.println(circle);
            System.out.println(circle.area());
            System.out.println(circle.perimeter());
        }
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(20);
        rectangle.setColor("#FFFFFF");
        rectangle.setFilled(true);

        testPolymh(rectangle);

        Circle circle = new Circle();
        circle.setR(20);
        circle.setFilled(true);
        circle.setColor("#39C5BB");
        testPolymh(circle);
    }
}
