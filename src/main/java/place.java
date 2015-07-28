import org.openqa.selenium.WebElement;

/**
 * Created by Гість on 28.07.2015.
 */
public class Place {

    private WebElement element;

    public Place(WebElement element) {
        this.element = element;
    }

//    public boolean isFree() {
//        String className = element.getClass().getName();
//        return className.contentEquals("lower");
//    }

    public boolean isFree() {
        String className = element.getAttribute("class");
        return className.contains("free");
    }

    public String getName() {
        return element.getAttribute("title");
    }

}
