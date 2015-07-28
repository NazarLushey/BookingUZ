import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Гість on 27.07.2015.
 */

public class VagonKupe {

    WebElement numberPlace;
    WebElement numberPlaceFree;
    ArrayList<Place> places = new ArrayList<Place>();


    public void loadPlaces(){
        List<WebElement> elements = loadPage.driver.findElements(By.xpath(".//*[@id='places']/p/a"));
        for (WebElement element : elements){
            Place place = new Place(element);
            places.add(place);
            System.out.println(place.getName() + "   " + place.isFree());
        }

    }
}
