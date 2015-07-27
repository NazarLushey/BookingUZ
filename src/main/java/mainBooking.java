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


            System.out.println("Train  " + result[i].trainNumber + "   Arival  " + result[i].dateArival);
            Thread.sleep(5000);
            loadPage.driver.findElement(By.partialLinkText("36")).click();


        }
        // System.out.println(loadPage.driver.findElement
        // (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[1]/td[4]")).getText());

        Thread.sleep(5000);

//        kupe[] place = new kupe[38];
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 4; j++) {
//                place[] = new kupe(i, j);
//            }
//        }
    }
}