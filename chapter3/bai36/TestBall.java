public class TestBall {
    
    public static void main(String[] args) {
        // Thử Ball và các getter/setter
        Ball testBall = new Ball(10, 10, 2, 3, 0);

        testBall.setX(20);
        testBall.setY(30);
        testBall.setRadius(4);
        testBall.setXDelta(5);
        testBall.setYDelta(6);

        System.out.println(testBall);
        System.out.println("x: " + testBall.getX());
        System.out.println("y: " + testBall.getY());
        System.out.println("radius: " + testBall.getRadius());
        System.out.println("xDelta: " + testBall.getXDelta());
        System.out.println("yDelta: " + testBall.getYDelta());

        testBall.move();
        testBall.reflectHorizontal();
        testBall.reflectVertical();
        System.out.println("After moving and reflecting: " + testBall);

        // Thử Container
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);

        System.out.println(box);
        System.out.println("Width: " + box.getWidth());
        System.out.println("Height: " + box.getHeight());
        System.out.println("Top-left x: " + box.getX());
        System.out.println("Top-left y: " + box.getY());

        // Di chuyển bóng và kiểm tra va chạm 100 lần
        for (int step = 0; step < 100; step++) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball);
        }
    }
}
