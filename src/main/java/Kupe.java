import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Гість on 27.07.2015.
 */
public class kupe {

    WebElement numberPlace;

    public kupe(int i, int j){
        numberPlace = loadPage.driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/span[2]/p[i]/a[j]/span"));

    }

    public void getEnabledPlace(){
        numberPlace.isEnabled();
    }

}
