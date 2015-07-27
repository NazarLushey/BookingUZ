
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class train {

    int index;
    String trainNumber;
    String trainFrom;
    String trainTo;
    String fromto;
    String dateDeparture;   //дата вв≥дправленн€
    String dateArival;      //дата прибутт€
    String timeDeparture;   //час вв≥дправленн€
    String timeArival;      //час
    String timeFromTo;      //час в≥дправленн€ ≥ прибутт€
    String duration;        //час в дороз≥
    int seatsAvailable_P;   // доступно плацкарт≥в
    int seatsAvailable_C;   // доступно купе
    int seatsAvailable_L;   // доступно люкс≥в
    int seatsAvailable_C1;  // доступно сид€чий 1-ого класу
    int seatsAvailable_C2;  // доступно сид€чий 2-ого класу


        public train(int i){

            trainNumber = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[1]/a")).getText();
            trainFrom = "trainFrom";
            trainTo = "trainTo";
            fromto = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[2]")).getText();
            dateDeparture = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[3]/div[1]/span")).getText();;   //дата вв≥дправленн€
            dateArival = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[3]/div[2]/span")).getText();     //дата прибутт€
            timeDeparture = "timeDeparture";   //час вв≥дправленн€
            timeArival = "timeArival";      //час прибутт€
            duration = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[5]")).getText();        //час в дороз≥
            seatsAvailable_P = 1;   // доступно плацкарт≥в
            seatsAvailable_C = 2;   // доступно купе
            seatsAvailable_L = 3;   // доступно люкс≥в
            seatsAvailable_C1 = 4;  // доступно сид€чий 1-ого класу
            seatsAvailable_C2 = 5;  // доступно сид€чий 2-ого класу


    }


}
