import org.openqa.selenium.By;

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
        System.out.println("Відправляється з станції: "+result[0].trainFrom);
        System.out.println("Прибуває на станцію: "+result[0].trainTo);
        System.out.println("Доступно місць:");
        System.out.println(result[0].seatType1 +"  "+ result[0].seatsAvailable1);
        if(result[0].seatsAvailable2!=0){System.out.println(result[0].seatType2 +"  "+ result[0].seatsAvailable2);} else{}
        if(result[0].seatsAvailable3!=0){System.out.println(result[0].seatType3 +"  "+ result[0].seatsAvailable3);} else{}

    }
}