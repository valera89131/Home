package lessons7.car.homeWork.triangleArea;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double triangleArea(){
        double p = (a+b+c)/2.0;
        double s = Math.pow(1.0/2.0,p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
