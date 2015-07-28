/**
 * Created by Oleksiy on 23.07.2015.
 */
public class mainBooking {
    public static void main(String[] args) throws InterruptedException {
        loadPage uz = new loadPage();
        uz.load();


        Thread.sleep(1000);
        train[] result = new train[uz.getRowCount()];
        for (int i = 0; i < uz.getRowCount(); i++) {

            result[i] = new train(i);


            System.out.println("Train  " + result[i].trainNumber + "   Departed on " + result[i].dateDeparture + " at " + result[i].hourFrom + ":" + result[i].minuteFrom +
                    ".  Arival on " + result[i].dateArival + " at " + result[i].hourTo + ":" + result[i].minuteTo + ".");

                }

        System.out.println(result[0].seatType1 +"  "+ result[0].seatsAvailable1);
        System.out.println(result[0].seatType2 +"  "+ result[0].seatsAvailable2);
        System.out.println(result[0].seatType3 + "  " + result[0].seatsAvailable3);


            VagonKupe vagonKupe = new VagonKupe();
            vagonKupe.loadPlaces();


//
//
//        VagonKupe[] place = new VagonKupe[40];
//        for(int i = 1; i <= 10; i++){
//            for (int j = 1; j <= 4; j++){
//                place[i] = new VagonKupe(i,j);
//                System.out.println("=========================="+place[i].numberPlace);
//            }
//
//
//        }




    }
}