/**
 * Created by goodmorning on 2014-12-07.
 */
import java.util.Scanner;


public class PathFindTest {
    public double start(String srcRegion, String dstRegion, String vehicle) {
        double time;


        DijkstraTest k = new DijkstraTest();

        int leastDistance =  k.start(Integer.parseInt(srcRegion), Integer.parseInt(dstRegion));

        VehicleTest vehicleClass = selectVehicle(vehicle);
        vehicleClass.setDistance(leastDistance);
        time = vehicleClass.getTime();
        return time;
    }

    private VehicleTest selectVehicle(String vehicle) {
        VehicleTest vehicleClass = null;
        switch (Integer.parseInt(vehicle)){
            case 1 : vehicleClass = new VehicleTest() {
                @Override
                public int getSpeed() {
                    return 0;
                }

                @Override
                public double getTime() {
                    return 0;
                }

                @Override
                public void setDistance(int distance) {

                }
            };
                     break;
        }

        return vehicleClass;
    }

}

