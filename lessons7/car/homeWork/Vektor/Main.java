package lessons7.car.homeWork.Vektor;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(5,45,21);
        Vector vector2 = new Vector(15,35,1);
        System.out.println(vector1.scalar(vector2));
        System.out.println(vector1.sumVectors(vector2));
        System.out.println(vector1.vectorMultiplication(vector2));

    }
}
