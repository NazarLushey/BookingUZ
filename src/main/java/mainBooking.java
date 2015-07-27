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


            System.out.println("Train  "+result[i].trainNumber+"   Arival  "+result[i].dateArival);




        }
      // System.out.println(loadPage.driver.findElement
               // (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[1]/td[4]")).getText());

        System.out.println(result[1].getHourFrom());
    }
}