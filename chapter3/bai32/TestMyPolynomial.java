public class TestMyPolynomial {
    public static void main(String[] args) {
        // Hệ số được đưa vào từ c0 trở lên:
        // 1 + 2x + 3x^2
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);

        System.out.println("p1 = " + p1);
        System.out.println("Degree = " + p1.getDegree());
        System.out.println("p1 at x = 2: " + p1.evaluate(2));

        // Constructor cũng nhận được một mảng
        double[] coefficients = {4, 5};
        MyPolynomial p2 = new MyPolynomial(coefficients);
        System.out.println("p2 = " + p2);

        // add() thay đổi p1
        p1.add(p2);
        System.out.println("p1 + p2 = " + p1);

        // (1 + 2x)(3 + 4x) = 3 + 10x + 8x^2
        MyPolynomial p3 = new MyPolynomial(1, 2);
        MyPolynomial p4 = new MyPolynomial(3, 4);

        p3.multiply(p4);
        System.out.println("p3 * p4 = " + p3);
    }
}