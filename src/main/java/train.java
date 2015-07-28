
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class train {

    int index;
    String trainNumber;
    String trainFrom;
    String trainTo;
    String fromto;
    String dateDeparture;
    String dateArival;
    String timeDeparture;
    String timeArival;
    String timeFromTo;
    int hourFrom;
    int minuteFrom;
    int hourTo;
    int minuteTo;

    String duration;
    String durationHour;
    String durationMinute;
    int durationMin;
    String seatType1;
    String seatType2;
    String seatType3;
    int seatsAvailable1;
    int seatsAvailable2;
    int seatsAvailable3;


        public train(int i) {

            trainNumber = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[1]/a")).getText();
            trainFrom = "trainFrom";
            trainTo = "trainTo";
            fromto = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[2]")).getText();
            dateDeparture = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[3]/div[1]/span")).getText();
            ;   //���� ������������
            dateArival = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[3]/div[2]/span")).getText();

            timeFromTo = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[4]")).getText();

            StringBuffer tft1 = new StringBuffer(timeFromTo);
            tft1.delete(2, tft1.length());
            hourFrom = Integer.parseInt(tft1.toString());

            StringBuffer tft2 = new StringBuffer(timeFromTo);
            tft2 = tft2.delete(0, 3);
            tft2 = tft2.delete(2, tft2.length());
            minuteFrom = Integer.parseInt(tft2.toString());

            StringBuffer tft3 = new StringBuffer(timeFromTo);
            tft3 = tft3.delete(0, 6);
            tft3 = tft3.delete(2, tft3.length());
            hourTo = Integer.parseInt(tft3.toString());

            StringBuffer tft4 = new StringBuffer(timeFromTo);
            tft4 = tft4.delete(0, 9);
            tft4 = tft4.delete(2, tft4.length());
            minuteTo = Integer.parseInt(tft4.toString());


            timeDeparture = "timeDeparture";
            timeArival = "timeArival";
            duration = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[5]")).getText();



            try {
                seatType1 = loadPage.driver.findElement
                        (By.xpath(".//*[@id='ts_res_tbl']/tbody/tr["+(1+i)+"]/td[6]/div[1]/i")).getText();
            }
            catch (Exception e){}

            try {
                seatType2 = loadPage.driver.findElement
                        (By.xpath(".//*[@id='ts_res_tbl']/tbody/tr["+(1+i)+"]/td[6]/div[2]/i")).getText();
            }
            catch (Exception e){}

            try {
                seatType3 = loadPage.driver.findElement
                        (By.xpath(".//*[@id='ts_res_tbl']/tbody/tr[" + (1 + i) + "]/td[6]/div[3]/i")).getText();
            }
            catch (Exception e){}

            try {
                 seatsAvailable1 = Integer.parseInt(loadPage.driver.findElement
                        (By.xpath(".//*[@id='ts_res_tbl']/tbody/tr[" + (i + 1) + "]/td[6]/div[1]/b")).getText());
            }
            catch (Exception e){}
            try {
                 seatsAvailable2 = Integer.parseInt(loadPage.driver.findElement
                        (By.xpath(".//*[@id='ts_res_tbl']/tbody/tr[" + (i + 1) + "]/td[6]/div[2]/b")).getText());
            }
            catch (Exception e){}
            try {
                 seatsAvailable3 = Integer.parseInt(loadPage.driver.findElement
                        (By.xpath(".//*[@id='ts_res_tbl']/tbody/tr[" + (i + 1) + "]/td[6]/div[3]/b")).getText());
            }
            catch (Exception e){}


        }


    public int getHourFrom() {
        return hourFrom;
    }

    public int getMinuteFrom() {
        return minuteFrom;
    }

    public int getHourTo() {
        return hourTo;
    }

    public int getMinuteTo() {
        return minuteTo;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public String getDurationHour() {
        return durationHour;
    }

    public String getDurationMinute() {
        return durationMinute;
    }

    public String getDuration() {
        return duration;
    }
}


