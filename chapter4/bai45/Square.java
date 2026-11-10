public class Square extends Rectangle{    
    public Square(){
        this(1.0);
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
    }

     @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override 
    public String toString(){
        return "Square[Rectangle[Shape[color=" + super.getColor() + ",filled=" + super.isFilled() + "],width=" + super.getWidth() + ",length=" + super.getLength() + "]]";
    }
}
