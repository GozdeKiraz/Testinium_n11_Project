import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass{

    //Element bulucu tanımlama
    By btnSignIn = By.className("btnSignIn");
    By email = By.id("email");
    By password = By.id("password");
    By loginButton = By.id("loginButton");
    By searchData=By.id("searchData");
    By searchBtn=By.className("searchBtn");
    By twoPage=By.xpath("//*[@id=\"contentListing\"]/div/div/div[2]/div[4]/a[2]");
    By product=By.xpath("//*[@id=\"p-405480286\"]/div[1]/a");
    By productname=By.className("productName");
    By addToBasket=By.xpath("//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[3]/a[2]");
    By basket=By.className("myBasket");
    By spinnerUp=By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/div/span[1]");
    By removeProduct=By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[1]/div[3]/div[2]/span[1]");


    private WebDriver driver;

    //Driver çağırma
    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

   //Login olma
    public void  login()  {

    //Sayfa içi kaydırma
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 250);");

        driver.findElement(btnSignIn).click();
        driver.findElement(email).sendKeys("gzdkiraz@gmail.com");
        driver.findElement(password).sendKeys("Hm5.g35918");
        driver.findElement(loginButton).click();

    }

    //Ürüm arama
    public void search(){

      driver.findElement(searchData).sendKeys("bilgisayar");
      driver.findElement(searchBtn).click();
    }

    //İkinci sayfaya geçme
    public void nextTwoPage(){

        driver.findElement(twoPage).click();
    }

    //Ürün seçme
    public void selectProduct(){

        driver.findElement(product).click();
        driver.findElement(productname).click();
    }

    //Ürünü sepete ekleme
     public void addToBasket(){

        driver.findElement(addToBasket).click();
        driver.findElement(basket).click();

    }

    //Ürün adedini iki yapma
    public void addProductTwo(){

        driver.findElement(spinnerUp).click();
    }

    //Ürünü silme
    public void removeProduct(){

        driver.findElement(removeProduct).click();

    }
}
