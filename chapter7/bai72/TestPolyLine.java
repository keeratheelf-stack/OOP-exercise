import java.util.ArrayList;
import java.util.List;

public class TestPolyLine {
    public static void main(String[] args) {
        PolyLine line1 = new PolyLine();
        System.out.println(line1); // {}

        line1.appendPoint(new Point(1, 2));
        line1.appendPoint(3, 4);
        line1.appendPoint(5, 6);

        System.out.println(line1); // {(1,2)(3,4)(5,6)}
        System.out.printf("Length: %.2f%n", line1.getLength());

        List<Point> points = new ArrayList<>();
        points.add(new Point(11, 12));
        points.add(new Point(13, 14));

        PolyLine line2 = new PolyLine(points);
        System.out.println(line2); // {(11,12)(13,14)}
        System.out.printf("Length: %.2f%n", line2.getLength());
    }
}