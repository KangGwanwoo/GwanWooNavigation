import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by goodmorning on 2014-12-07.
 */
public class DijkstraTest {


    private boolean[] visitedPoint;
    private int[] PointsOfBeforeDestination;
    private int[] routePoint;
    private int[] distanceTemp;
    private int[][] mapData;
    public int theNumberOfPoint = 0;

    public DijkstraTest(int mapData[][]){
        this.mapData = mapData;
        theNumberOfPoint = mapData.length;

        distanceTemp = new int[theNumberOfPoint];
        visitedPoint = new boolean[theNumberOfPoint];
        PointsOfBeforeDestination = new int[theNumberOfPoint];
        routePoint = new int[theNumberOfPoint];
    }
    public static DijkstraTest DijkstraInfoCreate(int mapData[][]){
        return new DijkstraTest(mapData);

   }
}
