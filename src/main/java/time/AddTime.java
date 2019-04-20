package time;

public class AddTime {

    public String addMinute(int hour, int minute, int amount){
        int newMinute = (minute+amount)%60;
        double newHour = (hour + Math.floor((minute + amount)/60)) % 24;
        return "{"+Math.round(newHour)+":"+newMinute+"}";
    }
}
