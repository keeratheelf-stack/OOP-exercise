import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        // Test Point2D with parameters
        Point2D point2D = new Point2D(1.5f, 2.5f);
        System.out.println("Point2D: " + point2D);
        System.out.println("x = " + point2D.getX());
        System.out.println("y = " + point2D.getY());
        System.out.println("XY = " + Arrays.toString(point2D.getXY()));

        point2D.setX(3.0f);
        point2D.setY(4.0f);
        System.out.println("After changing x and y: " + point2D);

        point2D.setXY(5.0f, 6.0f);
        System.out.println("After setXY: " + point2D);

        // Test Point2D default constructor
        Point2D origin2D = new Point2D();
        System.out.println("Default Point2D: " + origin2D);

        // Test Point3D with parameters
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);
        System.out.println("z = " + point3D.getZ());
        System.out.println("XYZ = " + Arrays.toString(point3D.getXYZ()));

        point3D.setZ(7.0f);
        System.out.println("After setZ: " + point3D);

        point3D.setXYZ(8.0f, 9.0f, 10.0f);
        System.out.println("After setXYZ: " + point3D);

        // Test Point3D default constructor
        Point3D origin3D = new Point3D();
        System.out.println("Default Point3D: " + origin3D);
    }
}