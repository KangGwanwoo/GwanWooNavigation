/**
 * Created by goodmorning on 2014-12-07.
 */
import java.util.Scanner;


public class PathFindTest {
    public int start(String srcRegion, String dstRegion, String vehicle) {
        int time;

        Dijkstra k = new Dijkstra();

        int leastDistance =  k.start(Integer.parseInt(srcRegion), Integer.parseInt(dstRegion));


        return leastDistance;
    }

}

