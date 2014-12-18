package vehiclePackage;

/**
 * Created by goodmorning on 2014-12-18.
 */
public class PrivateCar implements Vehicle{
    private int distance;
    private double time;
    private int speed;


    public PrivateCar(){
        speed = 60;
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
