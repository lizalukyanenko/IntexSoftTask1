package time;

public class DayDeclination {

    public String isDecllination(int amountDays){
        if (amountDays>=0){
            if (amountDays == 1){
                return "День";
            }else if(amountDays >= 2){
                return "Дня";
            }else{
                return "Дней";
            }
        }else{
            return "Invalid parameter entered.";
        }
    }
}
