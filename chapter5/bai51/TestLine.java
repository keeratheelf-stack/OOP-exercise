public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        System.out.println(line1);

        System.out.println("Begin point: " + line1.getBegin());
        System.out.println("End point: " + line1.getEnd());

        System.out.println("Begin x = " + line1.getBeginX());
        System.out.println("Begin y = " + line1.getBeginY());
        System.out.println("End x = " + line1.getEndX());
        System.out.println("End y = " + line1.getEndY());

        line1.setBeginX(1);
        line1.setBeginY(1);
        line1.setEndX(4);
        line1.setEndY(5);
        System.out.println("After changing coordinates: " + line1);

        line1.setBeginXY(0, 0);
        line1.setEndXY(3, 4);
        System.out.println("After setBeginXY and setEndXY: " + line1);

        System.out.println("Length = " + line1.getLength());
        System.out.println("Gradient = " + line1.getGradient());

        Point begin = new Point(2, 3);
        Point end = new Point(5, 7);
        Line line2 = new Line(begin, end);
        System.out.println("Line from Point objects: " + line2);

        line2.setBegin(new Point(0, 0));
        line2.setEnd(new Point(6, 8));
        System.out.println("After setBegin and setEnd: " + line2);
    }
}