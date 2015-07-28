/**
 * Created by Oleksiy on 23.07.2015.
 */
public class mainBooking {
    public static void main(String[] args) throws InterruptedException {
        loadPage uz = new loadPage();
        uz.load();

        train[] result = new train[uz.getRowCount()];
        for (int i = 0; i < uz.getRowCount(); i++) {

            result[i] = new train(i);


        System.out.println("Train  "+result[i].trainNumber+ "   Departed on " + result[i].dateDeparture + " at "+result[i].hourFrom+":"+result[i].minuteFrom +
                    ".  Arival on "+result[i].dateArival+ " at "+result[i].hourTo+":"+result[i].minuteTo+"." );



        }
        System.out.println();
        System.out.println("Дані про перший поїзд з списку:");
        System.out.println("Відправляється з станції: "+result[1].trainFrom);
        System.out.println("Прибуває на станцію: "+result[1].trainTo);
        System.out.println("Доступно місць:");
        System.out.println(result[1].seatType1 +"  "+ result[1].seatsAvailable1);
        if(result[0].seatsAvailable2!=0){System.out.println(result[1].seatType2 +"  "+ result[1].seatsAvailable2);} else{}
        if(result[0].seatsAvailable3!=0){System.out.println(result[1].seatType3 +"  "+ result[1].seatsAvailable3);} else{}
        System.out.println();
       

            VagonKupe vagonKupe = new VagonKupe();
            vagonKupe.loadPlaces();


//
//
//        VagonKupe[] Place = new VagonKupe[40];
//        for(int i = 1; i <= 10; i++){
//            for (int j = 1; j <= 4; j++){
//                Place[i] = new VagonKupe(i,j);
//                System.out.println("=========================="+Place[i].numberPlace);
//            }
//
//
//        }




    }
}