public class TestMyPoint {
    public static void main(String[] args) {
        // Thử constructor không tham số và toString()
        MyPoint p1 = new MyPoint();
        System.out.println(p1);

        // Thử setter và getter của x, y
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        // Thử setXY() và getXY()
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        // Thử constructor có hai tham số
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);

        // Thử cả ba cách gọi distance()
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());

        // Tạo 10 điểm: (1,1), (2,2), ... (10,10)
        MyPoint[] points = new MyPoint[10];

        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // In 10 điểm ra
        for (MyPoint point : points) {
            System.out.println(point);
        }
    }
}