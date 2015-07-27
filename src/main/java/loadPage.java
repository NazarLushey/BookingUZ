import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Oleksiy on 24.07.2015.
 */
public class loadPage {
    String placefrom ="Львів";
    String placeto ="Київ";
    String date ="28.07.2015";
    int refreshTime = 4000;
    int rowCount;
    static WebDriver driver = new FirefoxDriver();



    public void load() throws InterruptedException {

    driver.get("http://booking.uz.gov.ua/");


    WebElement goFromField = driver.findElement(By.name("station_from"));
    goFromField.click();
    goFromField.sendKeys(placefrom);
    WebElement choice1from = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[1]/div[2]/div/div/div/form/div[1]/div[1]/div[2]/div[1]")));
    choice1from.click();

    WebElement gotoField = driver.findElement(By.name("station_till"));
    gotoField.click();
    gotoField.sendKeys(placeto);
    WebElement choice1to = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div[3]/div[2]/div[1]")));
    choice1to.click();

    WebElement dateField = driver.findElement(By.id("date_dep"));
    dateField.click();
    dateField.clear();
    dateField.sendKeys(date);

    WebElement search = driver.findElement(By.name("search"));
    search.click();
    Thread.sleep(2000);

    while(driver.getPageSource().contains("За заданими Вами значенням нічого не знайдено.")){
        System.out.println("No trains found. Search again in "+ refreshTime/1000 +" seconds.");
        Thread.sleep(refreshTime);
        search.click();
    }
    System.out.print("Trains found: ");
       setRowCount(driver.findElements(By.className("num")).size());
    System.out.println(rowCount);
        System.out.println();

}

    public int getRowCount(){
            return rowCount;
    }
    public void setRowCount(int r){
        rowCount = r;
    }

}
