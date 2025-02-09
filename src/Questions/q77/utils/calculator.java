package Questions.q77.utils;

import Questions.q77.geometry.*;

public class calculator {
    public static void main(String[] args) {
        circle c1 = new circle(44);
        Rectangle r1 = new Rectangle(5,5);
        double areaCir = Math.PI * Math.pow(c1.radius,2);
        double areaRec = r1.len * r1.breadth;
        System.out.printf("%f %f",areaCir,areaRec);
    }
}
