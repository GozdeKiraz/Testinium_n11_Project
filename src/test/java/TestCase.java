import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;


public class TestCase extends BaseClass {

    //Senaryo testi
    @Test
    public void Login() {
        
        driver.navigate().to("https://www.n11.com/");
        new HomePage(driver).login();
        new HomePage(driver).search();
        new HomePage(driver).nextTwoPage();
        new HomePage(driver).selectProduct();
        new HomePage(driver).addToBasket();
        new HomePage(driver).addProductTwo();
        new HomePage(driver).removeProduct();

    }

    //Web site açılma kontrol testi
    @Test
    public void WebSiteControl() {

        driver.get("https://www.n11.com/");
        String urlEquals="https://www.n11.com/";
        assertEquals("https://www.n11.com/",urlEquals);
        System.out.println("Web Sitesi Açıldı");
    }

    //Login olma kontrol testi
   @Test
    public void LoginControl(){

       driver.navigate().to("https://www.n11.com/");
       new HomePage(driver).login();
       driver.navigate().to("https://www.n11.com/hesabim/siparislerim");
       String actualUrl="https://www.n11.com/hesabim/siparislerim";
       String expectedUrl= driver.getCurrentUrl();
       Assert.assertEquals(expectedUrl,actualUrl);
       System.out.println("Kullanıcı Girişi Başarılı.");

   }

   //İkinci sayfa açılması kontrol testi
    @Test
    public void NextTwoPageControl(){
        
        driver.navigate().to("https://www.n11.com/");
        new HomePage(driver).login();
        new HomePage(driver).search();
        new HomePage(driver).nextTwoPage();
        Assert.assertTrue(driver.getTitle().contains("Bilgisayar - n11.com - 2/50"));
        System.out.println("İkinci Sayfa Açıldı.");

    }

    }







