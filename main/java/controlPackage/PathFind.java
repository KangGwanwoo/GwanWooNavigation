package controlPackage; /**
 * Created by goodmorning on 2014-12-07.
 */

import mapPackage.StationMap;
import routingAlgorithm.Dijkstra;
import routingAlgorithm.RoutingAlgorithm;
import vehiclePackage.*;


public class PathFind {
    public double getEstimatedTime(String srcRegion, String dstRegion, String vehicle) {
        double time;
        StationMap map = new StationMap();
        RoutingAlgorithm k = new Dijkstra(map.getMap());

        int leastDistance =  k.getShortestPath(Integer.parseInt(srcRegion), Integer.parseInt(dstRegion));

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
            case 2 : vehicleClass = new Train();
                break;
            case 3 : vehicleClass = new Bus();
                break;
            case 4 : vehicleClass = new PrivateCar();
                break;
        }

        return vehicleClass;
    }

}

