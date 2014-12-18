/**
 * Created by goodmorning on 2014-12-11.
 */
public class Airplane implements VehicleTest{
    private int distance;
    private int time;
    private int speed;


    public Airplane(){
        speed = 300;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getTime() {
        time = distance/speed;
        return time;
    }

    @Override
    public void setDistance(int distance) {
        this.distance = distance;

    }
}
