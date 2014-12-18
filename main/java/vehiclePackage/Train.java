package vehiclePackage;

/**
 * Created by goodmorning on 2014-12-18.
 */
public class Train implements Vehicle{
    private int distance;
    private double time;
    private int speed;


    public Train(){
        speed = 150;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public double getTime() {

        time = (double)distance/speed;
        return time;
    }

    @Override
    public void setDistance(int distance) {
        this.distance = distance;

    }
}
