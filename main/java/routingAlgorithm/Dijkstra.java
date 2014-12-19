package routingAlgorithm;

import java.util.Vector;

/**
 * Created by goodmorning on 2014-12-07.
 */
public class Dijkstra implements RoutingAlgorithm{

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

    public Dijkstra(int[][] map){
        initMapInfo(map);
    }

    public void initMapInfo(int[][] map) {

        mapData = map;
        theNumberOfPoint = mapData.length;

        distanceTemp = new int[theNumberOfPoint];
        visitedPoint = new boolean[theNumberOfPoint];
        PointsOfBeforeDestination = new int[theNumberOfPoint];
        routePoint = new int[theNumberOfPoint];
    }



    public void println(Object line) {
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

    public void printUserInputInfo(int start, int end) {
        println("===============================================");
        println("Dijkstra Start");
        println("StartPoint: " + start);
        println("endPoint: " + end);
        println("===============================================");
    }

    public int theLeastDistance() {
        return distanceTemp[DestinationPoint - 1];
    }
    


    @Override
    public int getShortestPath(int start, int end) {

        startPoint = start;

        DestinationPoint = end;

        printUserInputInfo(start, end);


        initPointInfo();

        dijkstraAlgorithm();

        return theLeastDistance();
    }
}
