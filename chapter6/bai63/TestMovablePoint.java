public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(10, 20, 3, 5);

        System.out.println(point);

        point.moveUp();
        System.out.println("After moveUp: " + point);

        point.moveDown();
        System.out.println("After moveDown: " + point);

        point.moveLeft();
        System.out.println("After moveLeft: " + point);

        point.moveRight();
        System.out.println("After moveRight: " + point);
    }
}