package mathematics;

public class Multiplication {

    public void getMultiplicationTable(int numeric){
        for (int i = 1; i <= 10; i++){
            int multiply = numeric * i;
            System.out.println(numeric +" * "+ i +" = "+ multiply );
        }
    }
}
