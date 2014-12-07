/**
 * Created by goodmorning on 2014-12-07.
 */

import java.util.Scanner;


public class PathFind {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int srcRegion = 0, dstRegion = 0;
        boolean invalidInput = true;
        System.out.println("where are you ? please choose your place number.");
        System.out
                .println("1.Seoul 2.Gangneung 3.daejeon 4.gwangju 5.Busan 6.Jeju");

        String chosenNumber = scan.nextLine();
        srcRegion = checkPlaceNumber(srcRegion, invalidInput, chosenNumber);
        System.out
                .println("where are you going? please choose your destination number.");

        System.out
                .println("1.Seoul 2.Gangneung 3.daejeon 4.gwangju 5.Busan 6.Jeju");

        String dstNumber = scan.nextLine();

        invalidInput = true;
        dstRegion = checkPlaceNumber(dstRegion, invalidInput, dstNumber);


        int m = 30000; // 30000 경로가 없는 곳.
        int[][] data = new int[][] { { 0, 3, 2, 6, m, 2 },
                { 3, 0, 3, m, 8, m }, { 2, 3, 0, 2, 3, m },
                { 6, m, 2, 0, 7, m }, { m, 8, 3, 7, 0, 1 },
                { 2, m, m, m, 1, 0 }, };
        Dijkstra k = new Dijkstra(data);
        k.start(srcRegion, dstRegion);
    }

    public static int checkPlaceNumber(int srcRegion, boolean invalidInput, String chosenNumber) {
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
        return srcRegion;
    }
}

