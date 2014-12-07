/**
 * Created by goodmorning on 2014-12-07.
 */
import java.util.Scanner;


public class PathFindTest {
    public int TestMain() {
        Scanner scan = new Scanner(System.in);
        int srcRegion = 0, dstRegion = 0;
        boolean invalidInput = true;
        System.out.println("where are you ? please choose your place number.");
        System.out
                .println("1.Seoul 2.Gangneung 3.daejeon 4.gwangju 5.Busan 6.Jeju");

        String chosenNumber = "1";
        while (invalidInput) {
            if (chosenNumber.equals("1") || chosenNumber.equals("seoul")
                    || chosenNumber.equals("Seoul")) {
                srcRegion = 1;
                invalidInput = false;
            } else if (chosenNumber.equals("2")
                    || chosenNumber.equals("gangneung")
                    || chosenNumber.equals("Gangneung")) {
                srcRegion = 2;
                invalidInput = false;
            } else if (chosenNumber.equals("3")
                    || chosenNumber.equals("daejeon")
                    || chosenNumber.equals("Daejeon")) {
                srcRegion = 3;
                invalidInput = false;
            } else if (chosenNumber.equals("4")
                    || chosenNumber.equals("gwangju")
                    || chosenNumber.equals("Gwangju")) {
                srcRegion = 4;
                invalidInput = false;
            } else if (chosenNumber.equals("5") || chosenNumber.equals("busan")
                    || chosenNumber.equals("Busan")) {
                srcRegion = 5;
                invalidInput = false;
            } else if (chosenNumber.equals("6") || chosenNumber.equals("jeju")
                    || chosenNumber.equals("Jeju")) {
                srcRegion = 6;
                invalidInput = false;
            } else {
                System.out.println("input Text is invalid. you can try again");
            }
        }
        System.out
                .println("where are you going? please choose your destination number.");

        System.out
                .println("1.Seoul 2.Gangneung 3.daejeon 4.gwangju 5.Busan 6.Jeju");

        String dstNumber = "6";

        invalidInput = true;
        while (invalidInput) {
            if (dstNumber.equals("1") || dstNumber.equals("seoul")
                    || dstNumber.equals("Seoul")) {
                dstRegion = 1;
                invalidInput = false;
            } else if (dstNumber.equals("2")
                    || dstNumber.equals("gangneung")
                    || dstNumber.equals("Gangneung")) {
                dstRegion = 2;
                invalidInput = false;
            } else if (dstNumber.equals("3")
                    || dstNumber.equals("daejeon")
                    || dstNumber.equals("Daejeon")) {
                dstRegion = 3;
                invalidInput = false;
            } else if (dstNumber.equals("4")
                    || dstNumber.equals("gwangju")
                    || dstNumber.equals("Gwangju")) {
                dstRegion = 4;
                invalidInput = false;
            } else if (dstNumber.equals("5") || dstNumber.equals("busan")
                    || dstNumber.equals("Busan")) {
                dstRegion = 5;
                invalidInput = false;
            } else if (dstNumber.equals("6") || dstNumber.equals("jeju")
                    || dstNumber.equals("Jeju")) {
                dstRegion = 6;
                invalidInput = false;
            } else {
                System.out.println("input Text is invalid. you can try again");
            }
        }


        int m = 30000; // 30000 경로가 없는 곳.
        int[][] data = new int[][] { { 0, 3, 2, 6, m, 2 },
                { 3, 0, 3, m, 8, m }, { 2, 3, 0, 2, 3, m },
                { 6, m, 2, 0, 7, m }, { m, 8, 3, 7, 0, 1 },
                { 2, m, m, m, 1, 0 }, };
        Dijkstra k = new Dijkstra(data);

        return k.start(srcRegion, dstRegion);
    }
}

