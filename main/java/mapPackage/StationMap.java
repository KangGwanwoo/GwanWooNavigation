package mapPackage;

/**
 * Created by goodmorning on 2014-12-18.
 */
public class StationMap {

    private static int m = 30000;
    private static int[][] map = new int[][]  { { 0, 180, 120, 360, m, 120 },
            { 180, 0, 180, m, 480, m }, { 120, 180, 0, 120, 180, m },
            { 360, m, 180, 0, 420, m }, { m, 480, 180, 420, 0, 60 },
            { 120, m, m, m, 60, 0 }, };


    public static int[][] getMap(){

        return map;
    }
}
