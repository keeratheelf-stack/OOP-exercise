public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10.0);
        Cylinder c3 = new Cylinder(2.0, 10.0);

        System.out.println(c1);
        System.out.println("Volume: " + c1.getVolume());

        System.out.println(c2);
        System.out.println("Volume: " + c2.getVolume());

        System.out.println(c3);
        System.out.println("Radius: " + c3.getRadius());
        System.out.println("Color: " + c3.getColor());
        System.out.println("Height: " + c3.getHeight());
        System.out.println("Base area: " + c3.getBaseArea());
        System.out.println("Volume: " + c3.getVolume());

        c3.setRadius(3.0);
        c3.setColor("blue");
        c3.setHeight(5.0);

        System.out.println("After changing values: " + c3);
        System.out.println("New volume: " + c3.getVolume());
    }
}