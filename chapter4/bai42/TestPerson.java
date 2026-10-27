public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Tony Stark", "Malibu");
        System.out.println(person);

        person.setAddress("New York");
        System.out.println("Address: " + person.getAddress());

        Student student = new Student(
                "Peter Parker", "Queens",
                "Computer Science", 2, 1500.0
        );
        System.out.println(student);
        System.out.println("Student name: " + student.getName());

        student.setProgram("Software Engineering");
        student.setYear(3);
        student.setFee(1800.0);
        System.out.println(student);

        Staff staff = new Staff(
                "David", "Da Nang",
                "Viet-Han", 5000.0
        );
        System.out.println(staff);

        staff.setSchool("Stark Academy");
        staff.setPay(6000.0);
        System.out.println(staff);
    }
}