import java.util.Scanner;

/**
 * Created by goodmorning on 2014-12-18.
 */
public class User {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int srcRegion = 0, dstRegion = 0;

        SentenceToSelectPlace(0);
        String chosenNumber = scan.nextLine();
        srcRegion = checkPlaceNumber(srcRegion, chosenNumber);

        SentenceToSelectPlace(1);
        String dstNumber = scan.nextLine();

        dstRegion = checkPlaceNumber(dstRegion, dstNumber);

        System.out.println("What kind of transportation do we use?  please choose your vehicle number.\" ");
        System.out.println("1: AirPlane  2:Bus  3:train  4:private car ");
        String vehicle = scan.nextLine();
//        String vehicle = "1";

        PathFind pf = new PathFind();
        double time =  pf.start(chosenNumber , dstNumber ,vehicle);
        System.out.println("estimated arrival time is "+time+" hours.");

    }

    public static void SentenceToSelectPlace(int isDestinationSelect) {
        if(isDestinationSelect==0) {

            System.out.println("where are you ? please choose your place number.");

            System.out.println("1.Seoul 2.Gangneung 3.daejeon 4.gwangju 5.Busan 6.Jeju");
        }else{
            System.out.println("where are you going? please choose your destination number.");

            System.out.println("1.Seoul 2.Gangneung 3.daejeon 4.gwangju 5.Busan 6.Jeju");

        }
    }


    public static int checkPlaceNumber(int srcRegion, String chosenNumber) {
        boolean invalidInput = true;
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
