package cn.mikesolar.javahomework.class02.job01;

public class TestPlurality {

    public static void main(String[] args) {
        Plurality plurality = new Plurality();
        plurality.setA(1);
        plurality.setB(2);
        Plurality plurality1 = new Plurality(2, 4);
        System.out.println(plurality.toString());
        plurality.multiply(plurality1);
        System.out.println(plurality.toString());
        plurality.add(plurality1);
        System.out.println(plurality.toString());
    }
}
