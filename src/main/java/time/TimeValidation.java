package time;

public class TimeValidation {
    public boolean isTimeValid(int hour, int minute){
        if ((hour>=0 && hour <=24) && (minute>=0 && minute<=59)){
            return true;
        }else{
            return false;
        }
    }
}
