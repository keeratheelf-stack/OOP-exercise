public class TestMovable {
    public static void main(String[] args) {
        Movable point = new MovablePoint(5, 6, 10, 15);
        System.out.println("Point: " + point);
        point.moveLeft();
        System.out.println("After moveLeft: " + point);
        point.moveUp();
        System.out.println("After moveUp: " + point);

        Movable circle = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println("\nCircle: " + circle);
        circle.moveRight();
        System.out.println("After moveRight: " + circle);
        circle.moveDown();
        System.out.println("After moveDown: " + circle);

        Movable rectangle =
                new MovableRectangle(0, 0, 10, 5, 2, 3);
        System.out.println("\nRectangle: " + rectangle);
        rectangle.moveRight();
        System.out.println("After moveRight: " + rectangle);
        rectangle.moveDown();
        System.out.println("After moveDown: " + rectangle);
    }
}