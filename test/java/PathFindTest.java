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
            case 1 : vehicleClass = new Airplane();
                     break;
        }

        return vehicleClass;
    }

}

