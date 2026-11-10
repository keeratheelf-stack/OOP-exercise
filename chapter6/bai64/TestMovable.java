public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 6, 2, 3);
        MovableCircle circle = new MovableCircle(1, 2, 2, 3, 10);

        System.out.println("Point: " + point);
        point.moveUp();
        System.out.println("After moving point up: " + point);
        point.moveDown();
        System.out.println("After moving point down: " + point);
        point.moveLeft();
        System.out.println("After moving point left: " + point);
        point.moveRight();
        System.out.println("After moving point right: " + point);

        System.out.println("Circle: " + circle);
        circle.moveUp();
        System.out.println("After moving circle up: " + circle);
        circle.moveDown();
        System.out.println("After moving circle down: " + circle);
        circle.moveLeft();
        System.out.println("After moving circle left: " + circle);
        circle.moveRight();
        System.out.println("After moving circle right: " + circle);
    }
}