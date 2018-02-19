package lessons7.car.homeWork.triangleArea;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
       Triangle triangle = new Triangle(5.2,2.3,4.0);
       double area = triangle.triangleArea();
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        System.out.println(decimalFormat.format(area));
    }
}
