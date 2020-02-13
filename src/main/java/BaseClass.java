import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

    protected WebDriver driver;

    //Chrome çalıştırma
    @Before
    public void startUp() {
        setProperty();
        driver =new ChromeDriver();
    }

    //İşlem sonunda çıkış yapma
    @After
    public void tearDown(){

        driver.quit();
    }

    //Chrome için driver çağırma
    public static void setProperty() {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    }

    public void navigateUrl(String url) {
        driver.get(url);


    }

    }




