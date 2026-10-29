import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;
    
    public MyPolynomial(double... coeffs){
        if (coeffs.length == 0) {
            this.coeffs = new double[] {0.0};
        } else {
            this.coeffs = trim(coeffs.clone());
        }
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    private static double[] trim(double[] values) {
        int length = values.length;

        while (length > 1 && values[length - 1] == 0.0) {
            length--;
        }

        return Arrays.copyOf(values, length);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int power = getDegree(); power >= 0; power--) {
            double coefficient = coeffs[power];

            if (power != getDegree()) {
                result.append(coefficient < 0 ? " - " : " + ");
            } else if (coefficient < 0) {
                result.append("-");
            }

            result.append(Math.abs(coefficient));

            if (power == 1) {
                result.append("x");
            } else if (power > 1) {
                result.append("x^").append(power);
            }
        }

        return result.toString();
    }

    public double evaluate(double x) {
        double result = 0.0;

        for (int power = 0; power < coeffs.length; power++) {
            result += coeffs[power] * Math.pow(x, power);
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int length = Math.max(coeffs.length, right.coeffs.length);
        double[] result = new double[length];

        for (int i = 0; i < length; i++) {
            double thisCoefficient =
                    i < coeffs.length ? coeffs[i] : 0.0;
            double rightCoefficient =
                    i < right.coeffs.length ? right.coeffs[i] : 0.0;

            result[i] = thisCoefficient + rightCoefficient;
        }

        coeffs = trim(result);
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] result =
                new double[coeffs.length + right.coeffs.length - 1];

        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                result[i + j] += coeffs[i] * right.coeffs[j];
            }
        }

        coeffs = trim(result);
        return this;
    }
}
