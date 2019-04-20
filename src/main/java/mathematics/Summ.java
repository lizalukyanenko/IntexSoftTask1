package mathematics;

public class Summ {

    public int getSumm(int numeric){
        int summ = 0;
        if(numeric > 0){
            for (int i = 0; i <= numeric; i++){
                summ += i;
            }
            return summ;
        }else{
            return 0;
        }
    }
}
