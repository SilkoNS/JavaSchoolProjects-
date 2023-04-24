package src.cv3;

import java.util.Objects;

public class QuadraticFunction extends Function {
    private final double a;
    private final double b;
    private final double c;
    private final Double x1;
    private final Double x2;
    private Double discriminant;
    private Double y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuadraticFunction that = (QuadraticFunction) o;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0 && Double.compare(that.c, c) == 0 && Double.compare(getDiscriminant(), that.getDiscriminant()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, getDiscriminant());
    }

    @Override
    public String toString() {
        return "QuadraticFunction{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", discriminant=" + getDiscriminant() +
                '}';
    }

    public QuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        var d = getDiscriminant();
        var sqrt = Math.sqrt(d);
        x1 = (-b + sqrt) / (2 * a);
        x2 = (-b - sqrt) / (2 * a);
    }

    @Override
    public double calcY(double x) {
        if (y == null) {
            y = a * x * x + b * x + c;
        }
        return y;
    }

    int squareCount() {
        if (getDiscriminant() == 0)
            return 1;
        else if (getDiscriminant() > 1)
            return 2;
        else
            return 0;

    }

    public double getDiscriminant() {
        if (discriminant == null) {
            discriminant = b * b - 4 * a * c;
        }
        return discriminant;
    }

    public Double getX1() {
        return x1;
    }

    public Double getX2() {
        return x2;
    }
}
