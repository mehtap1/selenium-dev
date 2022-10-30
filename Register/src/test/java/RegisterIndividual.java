import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegisterIndividual
{
    @Test
    public void testRegisterWithId() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 25);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        driver.get("https://secure.sahibinden.com/kayit");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        driver.findElement(By.id("name")).sendKeys("mehtap");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
        driver.findElement(By.id("surname")).sendKeys("orhan");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.findElement(By.id("email")).sendKeys("mehtape1@mailinator.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        driver.findElement(By.id("password")).sendKeys("password1");

        //accept agreements
        //accept agreements
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        jse.executeScript("document.querySelector('#endUserLicenceAgreement').click()");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        jse.executeScript("document.querySelector('#communicationAgreement').click()");

        Thread.sleep(1500);
        driver.findElement(By.id("signUpButton")).click();

        Thread.sleep(1500);
        WebElement email = driver.findElement(By.id("viewEmail"));
        System.out.println("E mail=" + email.getText());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#confirmSubmit"))).click();
        driver.quit();
    }

    @Test
    public void testRegisterWithCss() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 25);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        driver.get("https://secure.sahibinden.com/kayit");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        driver.findElement(By.cssSelector("#name")).sendKeys("mehtap");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#surname")));
        driver.findElement(By.cssSelector("#surname")).sendKeys("ertem");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
        driver.findElement(By.cssSelector("#email")).sendKeys("mehtape89@mailinator.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        driver.findElement(By.cssSelector("#password")).sendKeys("password1");

        //accept agreements
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        jse.executeScript("document.querySelector('#endUserLicenceAgreement').click()");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        jse.executeScript("document.querySelector('#communicationAgreement').click()");

        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#signUpButton")).click();

        Thread.sleep(1500);
        WebElement email = driver.findElement(By.id("viewEmail"));
        System.out.println("E mail=" + email.getText());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#confirmSubmit"))).click();
        driver.quit();
    }
}
