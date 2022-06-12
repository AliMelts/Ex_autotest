import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SwagLabs {
    @Test
    public void testSwagLabsCreateOrder() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alena\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");

        WebElement element1 = driver.findElement(By.name("user-name"));
        element1.sendKeys("standard_user");
        WebElement element2 = driver.findElement(By.id("password"));
        element2.sendKeys("secret_sauce");
        WebElement element3 = driver.findElement(By.name("login-button"));
        element3.click();

        WebElement element4 = driver.findElement(By.className("inventory_item_name"));
        element4.click();

        WebElement element5 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        element5.click();
        WebElement element6 = driver.findElement(By.className("shopping_cart_link"));
        element6.click();

        WebElement element7 = driver.findElement(By.id("checkout"));
        element7.click();

        WebElement element8 = driver.findElement(By.xpath("//input[@name='firstName']"));
        element8.sendKeys("Tata");
        WebElement element9 = driver.findElement(By.xpath("//input[@name='lastName']"));
        element9.sendKeys("Snow");
        WebElement element10 = driver.findElement(By.xpath("//input[@name='postalCode']"));
        element10.sendKeys("111111");
        WebElement element11 = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        element11.click();
        WebElement element12 = driver.findElement(By.id("finish"));
        element12.click();

        driver.quit();
    }

    @Test
    public void testSwagLabsCreateOrderWithDelete() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alena\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@class='input_error form_input'][1]"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();

        WebElement addToCard1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
        addToCard1.click();
        WebElement addToCard2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        addToCard2.click();
        WebElement addToCard3 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
        addToCard3.click();
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        cart.click();

        WebElement remove = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]"));
        remove.click();
        WebElement continueChopping = driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
        continueChopping.click();

        WebElement addToCard4 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        addToCard4.click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        checkout.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys("Tata");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        lastName.sendKeys("Snow");
        WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
        postalCode.sendKeys("111111");
        WebElement continue1 = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        continue1.click();
        WebElement finish = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
        finish.click();

        driver.quit();

    }
}