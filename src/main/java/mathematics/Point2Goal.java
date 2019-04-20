package mathematics;

public class Point2Goal {
    public boolean isHitCircle(double x, double y){
        if ( (Math.pow((x-3),2)) + (Math.pow((y-5),2)) > Math.pow(4,2) ){
            return false;
        }else {
            return true;
        }
    }

    //public boolean isHitRectangle(int x, int y){}
}
