package lessons7.car.homeWork.Vektor;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector sumVectors(Vector vector) {
        return new Vector((x + vector.getX()), (y + vector.getY()), (z + vector.getZ()));
    }

    public double scalar(Vector vector) {
        return (x * vector.getX()) + (y * vector.getY()) + (z * vector.getZ());
    }

    public Vector vectorMultiplication(Vector vector) {
        return new Vector((y * vector.z - z * vector.getY()), (x * vector.getZ() - z * vector.getX()), (x * vector.getY() - y * vector.getX()));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vector{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", z=").append(z);
        sb.append('}');
        return sb.toString();
    }
}
