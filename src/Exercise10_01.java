public class Exercise10_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("Hour: " + time1.getHour() + " Minute: " + time1.getMinute() + " Second: " + time1.getSecond());

        Time time2 = new Time();
        System.out.println("Hour: " + time2.getHour() + " Minute: " + time2.getMinute() + " Second: " + time2.getSecond());
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    // Mengisi constructor currentTimeMillis(). Men define kelas Time(), sehingga kalau dipake harus wajib diisi.
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;

        second = (int)(totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        minute = (int)(totalMinutes % 60);

        int totalHours = (int)(totalMinutes / 60);

        hour = (int)(totalHours % 24);
    }
}