/**
 * QuadraticEquation.java
 */

package cn.mikesolar.javahomework.job03;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double discriminant = this.b * this.b - 4.0 * this.a * this.c;
        if (discriminant < 0.0) {
            discriminant=-1;
        }
        return discriminant;
    }

    public static class Roots{
        public double x1;
        public double x2;
        public Roots(double x1, double x2) {
            this.x1 = x1;
            this.x2 = x2;
        }
    }
    public Roots getRoots(){
        double discriminant = this.b * this.b - 4.0 * this.a * this.c;
        if (discriminant < 0.0) {
            return null;
        }
        Roots roots = new Roots((-this.b + Math.sqrt(discriminant)) / (2.0 * this.a),
                (-this.b - Math.sqrt(discriminant)) / (2.0 * this.a) );
        return roots;
    }
}
