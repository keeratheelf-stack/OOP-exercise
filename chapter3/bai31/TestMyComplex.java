public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex zero = new MyComplex();
        MyComplex number = new MyComplex(1.1, 2.2);

        // Constructor, getter, setter và toString
        System.out.println("Default: " + zero);
        System.out.println("Number: " + number);
        System.out.println("Real part: " + number.getReal());
        System.out.println("Imaginary part: " + number.getImag());

        number.setReal(3.0);
        number.setImag(4.0);
        number.setValue(1.1, 2.2);
        System.out.println("After setters: " + number);

        // Kiểm tra loại số và so sánh
        MyComplex realNumber = new MyComplex(5.0, 0.0);
        MyComplex imaginaryNumber = new MyComplex(0.0, 5.0);

        System.out.println("Is real? " + realNumber.isReal());
        System.out.println("Is imaginary? "
                + imaginaryNumber.isImaginary());
        System.out.println("Equals values? "
                + number.equals(1.1, 2.2));
        System.out.println("Equals another object? "
                + number.equals(new MyComplex(1.1, 2.2)));

        // Độ lớn và góc
        System.out.println("Magnitude: "
                + new MyComplex(3.0, 4.0).magnitude());
        System.out.println("Argument: "
                + new MyComplex(3.0, 4.0).argument());

        MyComplex right = new MyComplex(3.0, 4.0);

        // addInto thay đổi đối tượng đang gọi
        MyComplex sumInto = new MyComplex(1.0, 2.0);
        System.out.println("addInto: " + sumInto.addInto(right));

        // addNew tạo kết quả mới
        MyComplex sumNew = new MyComplex(1.0, 2.0);
        System.out.println("addNew: " + sumNew.addNew(right));
        System.out.println("Original after addNew: " + sumNew);

        System.out.println("Subtract: "
                + new MyComplex(5.0, 6.0).subtract(right));
        System.out.println("SubtractNew: "
                + new MyComplex(5.0, 6.0).subtractNew(right));
        System.out.println("Multiply: "
                + new MyComplex(1.0, 2.0).multiply(right));
        System.out.println("Divide: "
                + new MyComplex(1.0, 2.0).divide(right));
        System.out.println("Conjugate: "
                + new MyComplex(1.0, 2.0).conjugate());
    }
}