/**
 * Created by goodmorning on 2014-12-07.
 */

import java.util.Scanner;


public class PathFind {
    public double start(String srcRegion, String dstRegion, String vehicle) {
        double time;


        Dijkstra k = new Dijkstra();

        int leastDistance =  k.start(Integer.parseInt(srcRegion), Integer.parseInt(dstRegion));

        Vehicle vehicleClass = selectVehicle(vehicle);
        vehicleClass.setDistance(leastDistance);
        time = vehicleClass.getTime();
        return time;
    }

    private Vehicle selectVehicle(String vehicle) {
        Vehicle vehicleClass = null;
        switch (Integer.parseInt(vehicle)){
            case 1 : vehicleClass = new Airplane();
                break;
        }

        return vehicleClass;
    }

}

