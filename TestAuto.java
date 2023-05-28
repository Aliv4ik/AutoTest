import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAuto {

    WebDriver driver;

    @BeforeClass
    public static void setUpDriver() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
    }


    @Test
    public void autoTest() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".btn-outline-white")).click();
        driver.findElement(By.cssSelector("button.btn:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#signupName")).sendKeys("Alina");
        driver.findElement(By.cssSelector("#signupLastName")).sendKeys("Pasko");
        driver.findElement(By.cssSelector("#signupEmail")).sendKeys("test25alinaauto123@gmail.com");
        driver.findElement(By.cssSelector("#signupPassword")).sendKeys("qwerty123A456");
        driver.findElement(By.cssSelector("#signupRepeatPassword")).sendKeys("qwerty123A456");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.cssSelector("#addCarMileage")).sendKeys("13");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".btn-success")).click();
        driver.findElement(By.cssSelector("#addExpenseMileage")).sendKeys("14");
        driver.findElement(By.cssSelector("#addExpenseLiters")).sendKeys("15");
        driver.findElement(By.cssSelector("#addExpenseTotalCost")).sendKeys("111");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".btn-success")).click();
        driver.findElement(By.cssSelector("#addExpenseMileage")).sendKeys("15");
        driver.findElement(By.cssSelector("#addExpenseLiters")).sendKeys("15");
        driver.findElement(By.cssSelector("#addExpenseTotalCost")).sendKeys("222");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue("Text not found!", driver.getPageSource().contains("111.00 USD"));
        Assert.assertTrue("Text not found!", driver.getPageSource().contains("222.00 USD"));
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().to("https://guest:welcome2qauto@qauto.forstudy.space/panel/settings");
        driver.findElement(By.cssSelector(".btn-danger-bg")).click();
        driver.findElement(By.cssSelector(".btn-danger")).click();
    }
}