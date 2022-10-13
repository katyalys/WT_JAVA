package task1.math;

public class CalculateFunction {
    public double calculate(double x, double y) {
        double result = Math.sin(x + y);
        result *= result;
        result++;
        double denominator = (2 * x) / (1 + x * x + y * y);
        denominator = x - denominator;
        denominator = 2 + Math.abs(denominator);
        result /= denominator;
        return result + x;
    }
}
