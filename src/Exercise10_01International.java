public class Exercise10_01International {
    public static void main(String[] args) {
        
    }
}


class MyDateTime {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    MyDateTime() {

    }
    
    MyDateTime(long elapseTime) {
    }
    
    MyDateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
    
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setMonth(int monthInput) {
        this.month = monthInput;
    }

    public void setDay(int dayInput) {
        this.day = dayInput;
    }

    public void setHour(int hourInput) {
        this.hour = hourInput;
    }

    public void setMinute(int minuteInput) {
        this.minute = minuteInput;
    }

    public void setSecond(int secondInput) {
        this.second = secondInput;
      }  
    
}

