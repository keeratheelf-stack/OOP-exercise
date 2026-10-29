public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(){
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag){
        this.real=real;
        this.imag = imag;
    }

    public double getReal(){
        return real;
    }

    public void setReal(double real){
        this.real=real;
    }

    public double getImag(){
        return imag;
    }

    public void setImag(double imag){
        this.imag=imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag=imag;
    }

    @Override 
    public String toString(){
        if(imag < 0){
            return "(" + real + " - " + Math.abs(imag) + "i)";
        }
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal(){
       return imag == 0.0;
    }

    public boolean isImaginary(){
        return real == 0.0;
    }

    public boolean equals(double real, double imag){
        return this.real == real && this.imag == imag;
    }

    public boolean eqauls(MyComplex another){
        return another != null
            && this.real == another.real
            && this.imag == another.imag;
    }

    public double magnitude(){
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument(){
        return Math.atan2(imag, real);
    }

    public MyComplex addInto(MyComplex right){
        return add(right);
    }

    public MyComplex add(MyComplex right){
        real += right.real;
        imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(real + right.real, imag + right.imag);
    }

    public MyComplex subtract(MyComplex right){
        real -= right.real;
        imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(real - right.real, imag - right.imag);
    }

    public MyComplex multiply(MyComplex right){
        double newReal = real * right.real - imag - right.imag;
        double newImag = real * right.imag + imag * right.real;

        real = newReal;
        imag = newImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double denominator =
                right.real * right.real + right.imag * right.imag;

        if (denominator == 0.0) {
            throw new IllegalArgumentException(
                    "Cannot divide by zero complex number"
            );
        }

        double newReal =
                (real * right.real + imag * right.imag) / denominator;
        double newImag =
                (imag * right.real - real * right.imag) / denominator;

        real = newReal;
        imag = newImag;
        return this;
    }

    public MyComplex conjugate() {
        imag = -imag;
        return this;
    }
}