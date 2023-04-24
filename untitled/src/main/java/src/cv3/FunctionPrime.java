package src.cv3;

import java.util.Objects;

public class FunctionPrime extends Function {
    private final double k;
    private final double q;

    public FunctionPrime(double k, double q) {
        this.k = k;
        this.q = q;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionPrime that = (FunctionPrime) o;
        return Double.compare(that.k, k) == 0 && Double.compare(that.q, q) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(k, q);
    }

    @Override
    public String toString() {
        return "FunctionPrime{" +
                "k=" + k +
                ", q=" + q +
                '}';
    }

    @Override
    double calcY(double x) {
        return k * x + q;
    }
}

