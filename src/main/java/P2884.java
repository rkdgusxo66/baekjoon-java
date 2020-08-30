import javax.naming.MalformedLinkException;
import java.util.Scanner;

class Alarm{
    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Alarm(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return hour + " " + minute;
    }
}
public class P2884 {
    public static Alarm fixAlarm(Alarm alarm) {
        int hour = alarm.getHour();
        int minute = alarm.getMinute();

        minute -= 45;
        if(minute < 0){
            hour -= 1;
            minute += 60;
        }
        if(hour < 0){
            hour += 24;
        }

        return new Alarm(hour, minute);
    }

    public static void main(String... argv){
        Scanner scanner = new Scanner(System.in);
        Alarm alarm = new Alarm(scanner.nextInt(), scanner.nextInt());
        Alarm fixedAlarm = fixAlarm(alarm);
        System.out.println(fixedAlarm);
        return;
    }
}
