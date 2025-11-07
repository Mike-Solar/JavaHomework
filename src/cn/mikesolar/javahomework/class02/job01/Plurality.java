package cn.mikesolar.javahomework.class02.job01;

public class Plurality {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Plurality() {
        this.a = 0;
        this.b = 0;
    }

    public Plurality(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void add(Plurality plurality) {
        this.a += plurality.a;
        this.b += plurality.b;
    }

    public void multiply(Plurality plurality) {
        this.a = plurality.a * this.a - plurality.b * this.b;
        this.b = this.b * plurality.a - this.a * plurality.b;
    }

    @Override
    public String toString() {
        return String.valueOf(this.a) + "+" + this.b + "i";
    }
}
