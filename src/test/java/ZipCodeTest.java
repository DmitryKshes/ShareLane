import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZipCodeTest {

    @Test
    public void test1() {
        /*
       1. Открыть браузер.
       2. Открыть страницу https://www.sharelane.com/cgi-bin/register.py .
       3. В поле Zip code ввести 1111.
       4. Нажать кнопку continue.
       5. Проверить отображение текста ошибки.
       6. Закрыть браузер.
        */
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value = Continue]")).click();
        String errorMessage = browser.findElement(By.cssSelector("[class = error_message]")).getText();
        Assert.assertEquals(errorMessage, "Oops, error on page. ZIP code should have 5 digits");
        browser.quit();
    }

    @Test
    public void test2() {
        /*
       1. Открыть браузер.
       2. Открыть страницу https://www.sharelane.com/cgi-bin/register.py .
       3. В поле Zip code ввести test.
       4. Нажать кнопку continue.
       5. Проверить отображение текста ошибки.
       6. Закрыть браузер.
        */
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("test");
        browser.findElement(By.cssSelector("[value = Continue]")).click();
        String errorMessage = browser.findElement(By.cssSelector("[class = error_message]")).getText();
        Assert.assertEquals(errorMessage, "Oops, error on page. ZIP code should have 5 digits", "incorrect text");
        browser.quit();
    }

    @Test
    public void test3() {
        /*
       1. Открыть браузер.
       2. Открыть страницу https://www.sharelane.com/cgi-bin/register.py .
       3. Нажать кнопку continue.
       4. Проверить отоюражение текста ошибки.
       5. Закрыть браузер.
        */
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.cssSelector("[value = Continue]")).click();
        String errorMessage = browser.findElement(By.cssSelector("[class = error_message]")).getText();
        Assert.assertEquals(errorMessage, "Oops, error on page. ZIP code should have 5 digits", "incorrect text");
        browser.quit();
    }

    @Test
    public void test4() {
        /*
       1. Открыть браузер.
       2. Открыть страницу https://www.sharelane.com/cgi-bin/register.py .
       3. В поле Zip code ввести 11111.
       4. Нажать кнопку continue.
       5. Проверить переход на страницу регистрации.
       6. Закрыть браузер.
        */
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("11111");
        browser.findElement(By.cssSelector("[value = Continue]")).click();
        String getUrl = browser.getCurrentUrl();
        Assert.assertEquals(getUrl, "https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=11111", "Not registration page");
        browser.quit();
    }
    @Test
    public void emptyFieldFirstName() {
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("11111");
        browser.findElement(By.cssSelector("[value = Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("");
        browser.findElement(By.name("last_name")).sendKeys("Borodich");
        browser.findElement(By.name("email")).sendKeys("blabla@bla.com");
        browser.findElement(By.name("password1")).sendKeys("12345678");
        browser.findElement(By.name("password2")).sendKeys("12345678");
        browser.findElement(By.cssSelector("[value = Register]")).click();
        String errorMessage = browser.findElement(By.className("error_message")).getText();
        Assert.assertEquals(errorMessage, "Oops, error on page. Some of your fields have invalid data or email was previously used");
        browser.quit();
    }
}
