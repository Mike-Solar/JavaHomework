/**
 * TestQuadraticEquation.java
 */

package cn.mikesolar.javahomework.class01.job03;

public class TestQuadraticEquation {

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(1.0);
        quadraticEquation.setB(2.0);
        quadraticEquation.setC(1.0);

        if(quadraticEquation.getDiscriminant()>=0){
            QuadraticEquation.Roots roots = quadraticEquation.getRoots();
            System.out.println("x1="+roots.x1+",x2="+roots.x2);
        }
    }
}
