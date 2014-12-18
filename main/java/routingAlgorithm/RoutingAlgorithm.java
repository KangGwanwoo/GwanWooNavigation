package routingAlgorithm;

/**
 * Created by goodmorning on 2014-12-18.
 */
public interface RoutingAlgorithm {
    public void initMapInfo(int[][] map);
    public int getShortestPath(int start,int end);
}
