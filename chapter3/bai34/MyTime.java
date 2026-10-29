public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    
    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    @Override 
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        second++;

        if (second == 60) {
            second = 0;
            nextMinute();
        }

        return this;
    }

    public MyTime nextMinute() {
        minute++;

        if (minute == 60) {
            minute = 0;
            nextHour();
        }

        return this;
    }

    public MyTime nextHour() {
        hour = (hour + 1) % 24;
        return this;
    }

    public MyTime previousSecond() {
        if (second == 0) {
            second = 59;
            previousMinute();
        } else {
            second--;
        }

        return this;
    }

    public MyTime previousMinute() {
        if (minute == 0) {
            minute = 59;
            previousHour();
        } else {
            minute--;
        }

        return this;
    }

    public MyTime previousHour() {
        hour = (hour + 23) % 24;
        return this;
    }
}
