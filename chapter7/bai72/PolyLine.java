import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine(){
        points = new ArrayList<Point>();
    }

    public PolyLine(List<Point> points){
        this.points = points;
    }

    public void appendPoint(int x, int y){
        Point newPoint = new Point (x, y);
        points.add(newPoint);
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");

        for (Point point : points) {
            result.append(point);
        }

        result.append("}");
        return result.toString();
    }

     public double getLength() {
        double length = 0.0;

        for (int i = 1; i < points.size(); i++) {
            Point previous = points.get(i - 1);
            Point current = points.get(i);
            length += previous.distance(current);
        }

        return length;
    }
}
