public class TestMyTime {
    public static void main(String[] args) {
        // Constructor mặc định, getter và setter riêng
        MyTime time = new MyTime();
        System.out.println("Default: " + time);

        time.setHour(12);
        time.setMinute(34);
        time.setSecond(56);

        System.out.println("After setters: " + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());

        // setTime và constructor có tham số
        time.setTime(23, 59, 59);
        System.out.println("Set time: " + time);

        MyTime anotherTime = new MyTime(10, 20, 30);
        System.out.println("Another time: " + anotherTime);

        // Thử chuyển sang giây, phút, giờ tiếp theo
        System.out.println("Next second: "
                + new MyTime(23, 59, 59).nextSecond());
        System.out.println("Next minute: "
                + new MyTime(23, 59, 10).nextMinute());
        System.out.println("Next hour: "
                + new MyTime(23, 15, 10).nextHour());

        // Thử lùi về giây, phút, giờ trước
        System.out.println("Previous second: "
                + new MyTime(0, 0, 0).previousSecond());
        System.out.println("Previous minute: "
                + new MyTime(0, 0, 10).previousMinute());
        System.out.println("Previous hour: "
                + new MyTime(0, 15, 10).previousHour());

        // Thử nhập giờ không hợp lệ
        try {
            time.setTime(24, 0, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}