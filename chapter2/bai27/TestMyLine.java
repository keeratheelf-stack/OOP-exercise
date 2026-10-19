public class TestMyLine {
    public static void main(String[] args) {
       
        MyLine line = new MyLine(3, 4, 6 ,8);

        System.out.println(line);

        System.out.println("Begin X: " + line.getBeginX());
        System.out.println("Begin Y: " + line.getBeginY());
        System.out.println("End X: " + line.getEndX());
        System.out.println("End Y: " + line.getEndY());

        line.setBeginX(1);
        line.setBeginY(2);
        line.setEndX(4);
        line.setEndY(6);
        System.out.println(line);

        line.setBeginXY(3, 4);
        line.setEndXY(6, 8);
        System.out.println("Begin XY: " + "(" + line.getBeginXY()[0] + "," + line.getBeginXY()[1] + ")");
        System.out.println("End XY: " + "(" + line.getEndXY()[0] + "," + line.getEndXY()[1] + ")");

        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());

        MyPoint newBegin = new MyPoint(0, 0);
        MyPoint newEnd = new MyPoint(0, 5);
        line.setBegin(newBegin);
        line.setEnd(newEnd);
        System.out.println(line);

        MyLine anotherLine = new MyLine (newBegin, newEnd);
        System.out.println(anotherLine);
    }
}