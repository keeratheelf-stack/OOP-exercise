public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public static final String[] DAYS = {
        "Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"
    };

    public static final int[] DAYS_IN_MONTHS = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0)
                || year % 400 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }

        return day >= 1 && day <= daysInMonth(year, month);
    }

    // Số ngày trong một tháng cụ thể
    private static int daysInMonth(int year, int month) {
        int days = DAYS_IN_MONTHS[month - 1];

        if (month == 2 && isLeapYear(year)) {
            days++;
        }

        return days;
    }
public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException(
                    "Invalid year, month, or day!"
            );
        }

        int[] offsets = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        int adjustedYear = year;
        if (month < 3) {
            adjustedYear--;
        }

        return (adjustedYear
                + adjustedYear / 4
                - adjustedYear / 100
                + adjustedYear / 400
                + offsets[month - 1]
                + day) % 7;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException(
                    "Invalid year, month, or day!"
            );
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }

        this.year = year;
        shortenDayIfNeeded();
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }

        this.month = month;
        shortenDayIfNeeded();
    }

    public void setDay(int day) {
        if (day < 1 || day > daysInMonth(year, month)) {
            throw new IllegalArgumentException("Invalid day!");
        }

        this.day = day;
    }

    private void shortenDayIfNeeded() {
        int lastDay = daysInMonth(year, month);
        if (day > lastDay) {
            day = lastDay;
        }
    }

    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);

        return DAYS[dayOfWeek] + " " + day
                + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        if (day < daysInMonth(year, month)) {
            day++;
        } else if (month < 12) {
            day = 1;
            month++;
        } else {
            if (year == 9999) {
                throw new IllegalStateException("Year out of range!");
            }

            day = 1;
            month = 1;
            year++;
        }

        return this;
    }
    public MyDate nextMonth() {
        if (month == 12 && year == 9999) {
            throw new IllegalStateException("Year out of range!");
        }

        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }

        shortenDayIfNeeded();
        return this;
    }

    public MyDate nextYear() {
        if (year == 9999) {
            throw new IllegalStateException("Year out of range!");
        }

        year++;
        shortenDayIfNeeded();
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else {
            if (month == 1 && year == 1) {
                throw new IllegalStateException("Year out of range!");
            }

            if (month == 1) {
                month = 12;
                year--;
            } else {
                month--;
            }

            day = daysInMonth(year, month);
        }

        return this;
    }

    public MyDate previousMonth() {
        if (month == 1 && year == 1) {
            throw new IllegalStateException("Year out of range!");
        }

        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }

        shortenDayIfNeeded();
        return this;
    }

    public MyDate previousYear() {
        if (year == 1) {
            throw new IllegalStateException("Year out of range!");
        }

        year--;
        shortenDayIfNeeded();
        return this;
    }
}