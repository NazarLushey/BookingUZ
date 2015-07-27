
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class train {

    int index;
    String trainNumber;
    String trainFrom;
    String trainTo;
    String fromto;
    String dateDeparture;   //���� ������������
    String dateArival;      //���� ��������
    String timeDeparture;   //��� ������������
    String timeArival;      //���
    String timeFromTo;      //��� ����������� � ��������
    int hourFrom;
    int minuteFrom;
    int hourTo;
    int minuteTo;

    String duration;
    String durationHour;
    String durationMinute;
    int durationMin;
    int seatsAvailable_P;   // �������� ���������
    int seatsAvailable_C;   // �������� ����
    int seatsAvailable_L;   // �������� �����
    int seatsAvailable_C1;  // �������� ������� 1-��� �����
    int seatsAvailable_C2;  // �������� ������� 2-��� �����


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
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[3]/div[2]/span")).getText();     //���� ��������

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


            timeDeparture = "timeDeparture";   //��� ������������
            timeArival = "timeArival";      //��� ��������
            duration = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[5]")).getText();


            seatsAvailable_P = 1;   // �������� ���������
            seatsAvailable_C = 2;   // �������� ����
            seatsAvailable_L = 3;   // �������� �����
            seatsAvailable_C1 = 4;  // �������� ������� 1-��� �����
            seatsAvailable_C2 = 5;  // �������� ������� 2-��� �����
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


