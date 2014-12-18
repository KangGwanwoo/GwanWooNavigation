import static org.junit.Assert.assertEquals;

import jdk.nashorn.internal.objects.Global;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;
/**
 * Created by goodmorning on 2014-12-07.
 */
public class DijkstraTest {

    final static int m = 30000;
    private boolean[] visitedPoint;
    private int[] PointsOfBeforeDestination;
    private int[] routePoint;
    private int[] distanceTemp;
    private int[][] mapData;
    Vector<Integer> routerVector;
    public int theNumberOfPoint = 0;
    private int startPoint;
    private int DestinationPoint;

    public DijkstraTest(){
        initMapInfo();
    }

    public void initMapInfo() {
        mapData = new int[][] { { 0, 180, 120, 360, m, 120 },
                { 180, 0, 180, m, 480, m }, { 120, 180, 0, 120, 180, m },
                { 360, m, 180, 0, 420, m }, { m, 480, 180, 420, 0, 60 },
                { 120, m, m, m, 60, 0 }, };

        theNumberOfPoint = mapData.length;

        distanceTemp = new int[theNumberOfPoint];
        visitedPoint = new boolean[theNumberOfPoint];
        PointsOfBeforeDestination = new int[theNumberOfPoint];
        routePoint = new int[theNumberOfPoint];
    }


    public int start(int start, int end) {
        startPoint = start;
        DestinationPoint = end;
        printUserInfo(start, end);

        initPointInfo();

        dijkstraAlgorithm();

     return distanceTemp[DestinationPoint - 1];
    }



    public static DijkstraTest DijkstraInfoCreate(int mapData[][]){
        return new DijkstraTest();
   }

    public void println(Object line){
        System.out.println(line);
    }

    public void dijkstraAlgorithm() {
        int k = 0;
        int min = 0;
        distanceTemp[startPoint - 1] = 0;
        for (int i = 0; i < theNumberOfPoint; i++) {
            min = m;
            for (int j = 0; j < theNumberOfPoint; j++) { /* 정점의 수만큼 반복 */
                if (visitedPoint[j] == false && distanceTemp[j] < min) { /* 확인하지 않고 거리가 짧은 정점을 찾음 */
                    k = j;
                    min = distanceTemp[j];
                }
            }
            visitedPoint[k] = true; /* 해당 정점 확인 체크 */

            if (min == m)
                break; /* 연결된 곳이 없으면 종료 */

            /****
             * I -> J 보다 I -> K -> J의 거리가 더 작으면 갱신
             ****/
            for (int j = 0; j < theNumberOfPoint; j++) {
                if (distanceTemp[k] + mapData[k][j] < distanceTemp[j]) {
                    distanceTemp[j] = distanceTemp[k] + mapData[k][j]; /* 최단거리 저장 */
                    PointsOfBeforeDestination[j] = k; /* J로 가기 위해서는 K를 거쳐야 함 */
                }
            }


        }
    }

    public void initPointInfo() {
        for (int i = 0; i < theNumberOfPoint; i++) {
            distanceTemp[i] = m;
            PointsOfBeforeDestination[i] = 0;
            visitedPoint[i] = false;
        }
    }

    public void printUserInfo(int start, int end) {
        println("===============================================");
        println("Dijkstra Start");
        println("StartPoint: " + start);
        println("endPoint: " + end);
        println("===============================================");
    }
}
