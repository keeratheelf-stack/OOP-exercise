public class TestMyDate {
    public static void main(String[] args) {
        // Thử các hàm static
        System.out.println("Is 2012 a leap year? "
                + MyDate.isLeapYear(2012));
        System.out.println("Is 2012-02-29 valid? "
                + MyDate.isValidDate(2012, 2, 29));
        System.out.println("Day of week for 2012-02-28: "
                + MyDate.DAYS[MyDate.getDayOfWeek(2012, 2, 28)]);

        // Các trường hợp mẫu trong đề
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);
        System.out.println(d1.nextDay());
        System.out.println(d1.nextDay());
        System.out.println(d1.nextMonth());
        System.out.println(d1.nextYear());

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);
        System.out.println(d2.previousDay());
        System.out.println(d2.previousDay());
        System.out.println(d2.previousMonth());
        System.out.println(d2.previousYear());

        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());

        // Thử các setter và getter
        MyDate d4 = new MyDate(2020, 1, 31);
        d4.setMonth(2); // Ngày được rút xuống 29 vì năm 2020 nhuận
        System.out.println("After setMonth: " + d4);
        d4.setYear(2021); // Ngày được rút xuống 28
        System.out.println("After setYear: " + d4);
        d4.setDay(15);
        System.out.println("Date from getters: "
                + d4.getYear() + "-" + d4.getMonth() + "-" + d4.getDay());
        d4.setDate(2022, 12, 31);
        System.out.println("After setDate: " + d4);

        // In các ngày từ 28 Dec 2011 đến 2 Mar 2012
        MyDate loopDate = new MyDate(2011, 12, 28);

        while (true) {
            System.out.println(loopDate);

            if (loopDate.getYear() == 2012
                    && loopDate.getMonth() == 3
                    && loopDate.getDay() == 2) {
                break;
            }

            loopDate.nextDay();
        }
    }
}