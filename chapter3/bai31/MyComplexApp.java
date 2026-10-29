import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter complex number 1 (real and imaginary part): "
        );
        double real1 = input.nextDouble();
        double imag1 = input.nextDouble();

        System.out.print(
                "Enter complex number 2 (real and imaginary part): "
        );
        double real2 = input.nextDouble();
        double imag2 = input.nextDouble();

        MyComplex number1 = new MyComplex(real1, imag1);
        MyComplex number2 = new MyComplex(real2, imag2);

        System.out.println("\nNumber 1 is: " + number1);
        System.out.println(number1 + (number1.isReal()
                ? " is a pure real number"
                : " is NOT a pure real number"));
        System.out.println(number1 + (number1.isImaginary()
                ? " is a pure imaginary number"
                : " is NOT a pure imaginary number"));

        System.out.println("\nNumber 2 is: " + number2);
        System.out.println(number2 + (number2.isReal()
                ? " is a pure real number"
                : " is NOT a pure real number"));
        System.out.println(number2 + (number2.isImaginary()
                ? " is a pure imaginary number"
                : " is NOT a pure imaginary number"));

        System.out.println();
        if (number1.equals(number2)) {
            System.out.println(number1 + " is equal to " + number2);
        } else {
            System.out.println(number1 + " is NOT equal to " + number2);
        }

        // Tạo bản sao để phép tính không làm thay đổi number1
        MyComplex sum = new MyComplex(real1, imag1).add(number2);
        MyComplex difference =
                new MyComplex(real1, imag1).subtract(number2);
        MyComplex product =
                new MyComplex(real1, imag1).multiply(number2);

        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = "
                + difference);
        System.out.println(number1 + " * " + number2 + " = " + product);

        if (real2 == 0.0 && imag2 == 0.0) {
            System.out.println("Cannot divide by zero complex number.");
        } else {
            MyComplex quotient =
                    new MyComplex(real1, imag1).divide(number2);
            System.out.println(number1 + " / " + number2 + " = "
                    + quotient);
        }

        input.close();
    }
}