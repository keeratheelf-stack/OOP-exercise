public class TestLineSub {
    public static void main(String[] args) {
        LineSub line = new LineSub(0, 0, 3, 4);

        System.out.println(line);
        System.out.println("Begin x = " + line.getBeginX());
        System.out.println("Begin y = " + line.getBeginY());
        System.out.println("End x = " + line.getEndX());
        System.out.println("End y = " + line.getEndY());
        System.out.println("Length = " + line.getLength());
        System.out.println("Gradient = " + line.getGradient());

        line.setBeginXY(1, 1);
        line.setEndXY(4, 5);
        System.out.println("After changing both points: " + line);

        line.setBeginX(0);
        line.setBeginY(0);
        line.setEndX(6);
        line.setEndY(8);
        System.out.println("After changing coordinates: " + line);

        Point begin = new Point(2, 3);
        Point end = new Point(5, 7);
        LineSub line2 = new LineSub(begin, end);
        System.out.println("LineSub from Point objects: " + line2);

        line2.setBegin(new Point(0, 0));
        line2.setEnd(new Point(3, 4));
        System.out.println("After setBegin and setEnd: " + line2);

        System.out.println("getBegin returns this object: "
                + (line2.getBegin() == line2));

        // Test the inherited Point methods
        line2.setXY(10, 20);
        System.out.println("Inherited getX: " + line2.getX());
        System.out.println("Inherited getY: " + line2.getY());
        line2.setX(30);
        line2.setY(40);
        System.out.println("After inherited setters: " + line2);
    }
}