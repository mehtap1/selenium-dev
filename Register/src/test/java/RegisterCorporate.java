import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegisterCorporate
{

    ChromeDriver driver;

    @BeforeEach()
    public void beforeEach()
    {
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://secure.sahibinden.com/kayit/kurumsal/");
    }

    @Test
    public void testRegisterCorporateWithId() throws InterruptedException
    {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        driver.findElement(By.id("name")).sendKeys("mehtap");
        System.out.println("İsim eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
        driver.findElement(By.id("surname")).sendKeys("ertem");
        System.out.println("Soyİsim eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.findElement(By.id("email")).sendKeys("mehtapertem19@mailinator.com");
        System.out.println("Email eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        driver.findElement(By.id("password")).sendKeys("password1");
        System.out.println("Şifre eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
        driver.findElement(By.id("phone")).sendKeys("2164503434");
        System.out.println("Telefon eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("category")));
        Select realEstateSelect = new Select(driver.findElement(By.id("category")));
        realEstateSelect.selectByVisibleText("Emlak");
        System.out.println("Emlak seçildi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
        Select citySelect = new Select(driver.findElement(By.id("city")));
        citySelect.selectByVisibleText("İstanbul");
        System.out.println("Şehir seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("town")));
        Select townSelect = new Select(driver.findElement(By.id("town")));
        townSelect.selectByVisibleText("Ataşehir");
        System.out.println("İlçe seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quarter")));
        Select quarterSelect = new Select(driver.findElement(By.id("quarter")));
        quarterSelect.selectByVisibleText("Atatürk Mh.");
        System.out.println("Mahalle seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxOfficeCity")));
        Select taxOfficeCitySelect = new Select(driver.findElement(By.id("taxOfficeCity")));
        taxOfficeCitySelect.selectByVisibleText("İstanbul");
        System.out.println("Vergi ofisi seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxOffice")));
        Select taxOfficeSelect = new Select(driver.findElement(By.id("taxOffice")));
        taxOfficeSelect.selectByVisibleText("Anadolu Kurumlar Vergi Dairesi");
        System.out.println("Vergi dairesi seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxNumber")));
        WebElement taxNumberSelect = driver.findElement(By.id("taxNumber"));
        taxNumberSelect.sendKeys("4220797255");
        System.out.println("VKN eklendi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idNumber")));
        WebElement idNumberSelect = driver.findElement(By.id("idNumber"));
        idNumberSelect.sendKeys("53818905920");
        System.out.println("TCKN eklendi");

        Thread.sleep(1500);
        driver.executeScript("document.getElementById('endUserLicenceAgreement').click()");
        System.out.println("Sözleşmelere tıklandı");

        Thread.sleep(1500);
        driver.findElement(By.id("signUpButton")).click();
        System.out.println("Üye Ol butonuna basıldı");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmSubmit"))).click();
        System.out.println("Onayla butonuna basıldı");
    }

    @Test
    public void testRegisterCorporateWithCss() throws InterruptedException
    {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        driver.findElement(By.cssSelector("#name")).sendKeys("mehtap");
        System.out.println("İsim eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#surname")));
        driver.findElement(By.cssSelector("#surname")).sendKeys("ertem");
        System.out.println("Soyİsim eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
        driver.findElement(By.cssSelector("#email")).sendKeys("mehtapertem10@mailinator.com");
        System.out.println("Email eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        driver.findElement(By.cssSelector("#password")).sendKeys("password1");
        System.out.println("Şifre eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#phone")));
        driver.findElement(By.cssSelector("#phone")).sendKeys("2164503434");
        System.out.println("Telefon eklendi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#category")));
        Select realEstateSelect = new Select(driver.findElement(By.cssSelector("#category")));
        realEstateSelect.selectByVisibleText("Emlak");
        System.out.println("Emlak seçildi");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#city")));
        Select citySelect = new Select(driver.findElement(By.cssSelector("#city")));
        citySelect.selectByVisibleText("İstanbul");
        System.out.println("Şehir seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#town")));
        Select townSelect = new Select(driver.findElement(By.cssSelector("#town")));
        townSelect.selectByVisibleText("Ataşehir");
        System.out.println("İlçe seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#quarter")));
        Select quarterSelect = new Select(driver.findElement(By.cssSelector("#quarter")));
        quarterSelect.selectByVisibleText("Atatürk Mh.");
        System.out.println("Mahalle seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxOfficeCity")));
        Select taxOfficeCitySelect = new Select(driver.findElement(By.cssSelector("#taxOfficeCity")));
        taxOfficeCitySelect.selectByVisibleText("İstanbul");
        System.out.println("Vergi ofisi seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxOffice")));
        Select taxOfficeSelect = new Select(driver.findElement(By.cssSelector("#taxOffice")));
        taxOfficeSelect.selectByVisibleText("Anadolu Kurumlar Vergi Dairesi");
        System.out.println("Vergi dairesi seçildi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxNumber")));
        WebElement taxNumberSelect = driver.findElement(By.cssSelector("#taxNumber"));
        taxNumberSelect.sendKeys("4220797255");
        System.out.println("VKN eklendi");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#idNumber")));
        WebElement idNumberSelect = driver.findElement(By.cssSelector("#idNumber"));
        idNumberSelect.sendKeys("53818905920");
        System.out.println("TCKN eklendi");

        Thread.sleep(1500);
        driver.executeScript("document.getElementById('endUserLicenceAgreement').click()");
        System.out.println("Sözleşmelere tıklandı");

        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#signUpButton")).click();
        System.out.println("Üye Ol butonuna basıldı");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#confirmSubmit"))).click();
        System.out.println("Onayla butonuna basıldı");
    }

    @AfterEach
    public void afterEach()
    {
        driver.quit();
        System.out.println("Tarayıcı kapatıldı...");
    }


}
