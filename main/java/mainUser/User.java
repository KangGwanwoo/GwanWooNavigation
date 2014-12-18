package mainUser;

import controlPackage.PathFind;

import java.util.Scanner;

/**
 * Created by goodmorning on 2014-12-18.
 */
public class User {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String chosenNumber =sentenceToSelectPlace(0, scan);


        String dstNumber = sentenceToSelectPlace(1, scan);


        String vehicle = sentenceToSelectVehicle(scan);

        PathFind pf = new PathFind();
        double time =  pf.getEstimatedTime(chosenNumber, dstNumber, vehicle);

        System.out.println("estimated arrival time is "+time+" hours.");

    }

    public static String sentenceToSelectVehicle(Scanner scan) {
        System.out.println("What kind of transportation do we use?  please choose your vehicle number.\" ");
        System.out.println("1: AirPlane  2:Bus  3:train  4:private car ");
        return scan.nextLine();
    }

    public static String sentenceToSelectPlace(int isDestinationSelect,Scanner scan) {
        if(isDestinationSelect==0) {

            System.out.println("where are you ? please choose your place number.");

            System.out.println("1.Seoul 2.Gangneung 3.daejeon 4.gwangju 5.Busan 6.Jeju");
        }else{
            System.out.println("where are you going? please choose your destination number.");

            System.out.println("1.Seoul 2.Gangneung 3.daejeon 4.gwangju 5.Busan 6.Jeju");

        }
        return scan.nextLine();
    }

}
