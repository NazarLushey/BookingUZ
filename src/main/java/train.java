
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
    String duration;        //��� � �����
    int seatsAvailable_P;   // �������� ���������
    int seatsAvailable_C;   // �������� ����
    int seatsAvailable_L;   // �������� �����
    int seatsAvailable_C1;  // �������� ������� 1-��� �����
    int seatsAvailable_C2;  // �������� ������� 2-��� �����


        public train(int i){

            trainNumber = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[1]/a")).getText();
            trainFrom = "trainFrom";
            trainTo = "trainTo";
            fromto = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[2]")).getText();
            dateDeparture = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[3]/div[1]/span")).getText();;   //���� ������������
            dateArival = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[3]/div[2]/span")).getText();     //���� ��������
            timeDeparture = "timeDeparture";   //��� ������������
            timeArival = "timeArival";      //��� ��������
            duration = loadPage.driver.findElement
                    (By.xpath("html/body/div[1]/div[2]/div/div/div/div[6]/table/tbody/tr[" + (i + 1) + "]/td[5]")).getText();        //��� � �����
            seatsAvailable_P = 1;   // �������� ���������
            seatsAvailable_C = 2;   // �������� ����
            seatsAvailable_L = 3;   // �������� �����
            seatsAvailable_C1 = 4;  // �������� ������� 1-��� �����
            seatsAvailable_C2 = 5;  // �������� ������� 2-��� �����


    }


}
