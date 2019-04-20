package time;

public class TimeOfTheYear {

    public String isTimeOfTheYear(int numberMonth){
        if (numberMonth>0 && numberMonth<13){
            if(numberMonth==12 || (numberMonth>=1 && numberMonth<=2)){
                return "Winter";
            }else if(numberMonth>=3 && numberMonth<=5){
                return "Spring";
            }else if(numberMonth>=6 && numberMonth<=8){
                return "Summer";
            }else{
                return "Fall";
            }
        }else{
            return "There is no month with this number";
        }
    }
}
