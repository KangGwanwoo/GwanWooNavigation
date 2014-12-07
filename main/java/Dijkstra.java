import java.util.Vector;

/**
 * Created by goodmorning on 2014-12-07.
 */
public class Dijkstra {

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

    public Dijkstra(){
        this.mapData = new int[][] { { 0, 3, 2, 6, m, 2 },
                { 3, 0, 3, m, 8, m }, { 2, 3, 0, 2, 3, m },
                { 6, m, 2, 0, 7, m }, { m, 8, 3, 7, 0, 1 },
                { 2, m, m, m, 1, 0 }, };
        theNumberOfPoint = mapData.length;

        distanceTemp = new int[theNumberOfPoint];
        visitedPoint = new boolean[theNumberOfPoint];
        PointsOfBeforeDestination = new int[theNumberOfPoint];
        routePoint = new int[theNumberOfPoint];
    }
    public static Dijkstra DijkstraInfoCreate(int mapData[][]){
        return new Dijkstra();
    }

    public void println(Object line){
        System.out.println(line);
    }

    public int start(int start, int end) {
        println("===============================================");
        println("Dijkstra Start");
        println("StartPoint: " + start);
        println("endPoint: " + end);
        println("===============================================");

        startPoint = start;
        DestinationPoint = end;
        int k = 0;
        int min = 0;
        for (int i = 0; i < theNumberOfPoint; i++) {
            distanceTemp[i] = m;
            PointsOfBeforeDestination[i] = 0;
            visitedPoint[i] = false;
        }

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

        return theLeastDistance();
    }
    public int theLeastDistance() {
        return distanceTemp[DestinationPoint - 1];
    }

    /**** 최단 거리 출력 ****/
    public void nowLeastDistance() {
        System.out.printf("최단거리:  %10d  시간   ", distanceTemp[DestinationPoint- 1]);
    }

    /**** 최단 경로를 저장 ****/
    public void inverseFind() {
        int tmp = 0;
        int top = -1;
        tmp = DestinationPoint - 1;
        while (true) {
            routePoint[++top] = tmp + 1;
            if (tmp == startPoint - 1)
                break; /* 시작점에 이르렀으면 종료 */
            tmp = distanceTemp[tmp];
        }

		/* 역추적 결과 출력 */
        routerVector.removeAllElements();
        for (int i = top; i > -1; i--) {
            System.out.printf("%d", routePoint[i]);
            routerVector.add(routePoint[i]);
            if (i != 0)System.out.printf(" -> ");
        }
        System.out.printf("\n");
    }

    public Vector<Integer> getStack()
    {
        return routerVector;
    }

}
