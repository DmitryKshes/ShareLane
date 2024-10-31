import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShoppingCardTest {
    @Test
    public void checkDiscountZeroPercent() {
// регистрация - логинимся - выбираем книгу и отправляем ее в корзину - заходим и проверяем скидки
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=test&last_name=" +
                "test&email=user%40pflb.ru&password1=12345678&password2=12345678");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMinValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(discountPercentMinValue, "0", "incorrect count percent");
        softAssert.assertEquals(discountMinValue$, "0.0", "incorrect count discount");
        softAssert.assertEquals(totalMinValue, "10.0", "incorrect total sum");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("19");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMaxValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(discountPercentMaxValue, "0", "incorrect count percent");
        softAssert.assertEquals(discountMaxValue$, "0.0", "incorrect count discount");
        softAssert.assertEquals(totalMaxValue, "190.0", "incorrect total sum");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscountTwoPercent() {
// регистрация - логинимся - выбираем книгу и отправляем ее в корзину - заходим и проверяем скидки
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=test&last_name=" +
                "test&email=user%40pflb.ru&password1=12345678&password2=12345678");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("20");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMinValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(discountPercentMinValue, "2", "incorrect count percent");
        softAssert.assertEquals(discountMinValue$, "4.0", "incorrect count discount");
        softAssert.assertEquals(totalMinValue, "196.0", "incorrect total sum");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("49");
        driver.findElement((By.cssSelector("[value = Update]"))).click();
        String discountPercentMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMaxValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(discountPercentMaxValue, "2", "incorrect count percent");
        softAssert.assertEquals(discountMaxValue$, "9.8", "incorrect count discont");
        softAssert.assertEquals(totalMaxValue, "480.2", "incorrect total sum");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscountThreePercent() {
// регистрация - логинимся - выбираем книгу и отправляем ее в корзину - заходим и проверяем скидки
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=test&last_name=" +
                "test&email=user%40pflb.ru&password1=12345678&password2=12345678");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("50");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMinValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(discountPercentMinValue, "2", "incorrect count percent");
        softAssert.assertEquals(discountMinValue$, "4.2", "incorrect count discount");
        softAssert.assertEquals(totalMinValue, "205.8", "incorrect total sum");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("99");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMaxValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(discountPercentMaxValue, "2", "incorrect count percent");
        softAssert.assertEquals(discountMaxValue$, "4.2", "incorrect count discount");
        softAssert.assertEquals(totalMaxValue, "205.8", "incorrect total sum");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscountFourPercent() {
// регистрация - логинимся - выбираем книгу и отправляем ее в корзину - заходим и проверяем скидки
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=test&last_name=" +
                "test&email=user%40pflb.ru&password1=12345678&password2=12345678");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("100");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMinValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(discountPercentMinValue, "4", "incorrect count percent");
        softAssert.assertEquals(discountMinValue$, "40.0", "incorrect count discount");
        softAssert.assertEquals(totalMinValue, "960", "incorrect total sum");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("499");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMaxValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(discountPercentMaxValue, "4", "incorrect count percent");
        softAssert.assertEquals(discountMaxValue$, "199.6", "incorrect count discount");
        softAssert.assertEquals(totalMaxValue, "4790.4", "incorrect total sum");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscountFivePercent() {
// регистрация - логинимся - выбираем книгу и отправляем ее в корзину - заходим и проверяем скидки
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=test&last_name=" +
                "test&email=user%40pflb.ru&password1=12345678&password2=12345678");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("500");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(discountPercent, "5", "incorrect count percent");
        softAssert.assertEquals(discount$, "250.0", "incorrect count discount");
        softAssert.assertEquals(total, "4750.0", "incorrect total sum");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("999");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMaxValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(discountPercentMaxValue, "5", "incorrect count percent");
        softAssert.assertEquals(discountMaxValue$, "499.5", "incorrect count discount");
        softAssert.assertEquals(totalMaxValue, "9490.5", "incorrect total sum");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscountSixPercent() {
// регистрация - логинимся - выбираем книгу и отправляем ее в корзину - заходим и проверяем скидки
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=test&last_name=" +
                "test&email=user%40pflb.ru&password1=12345678&password2=12345678");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1000");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMinValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(discountPercentMinValue, "6", "incorrect count percent");
        softAssert.assertEquals(discountMinValue$, "600.0", "incorrect count discount");
        softAssert.assertEquals(totalMinValue, "9400", "incorrect total sum");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("4999");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMaxValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(discountPercentMaxValue, "6", "incorrect count percent");
        softAssert.assertEquals(discountMaxValue$, "2999.4", "incorrect count discount");
        softAssert.assertEquals(totalMaxValue, "46990.6", "incorrect total sum");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscountSevenPercent() {
// регистрация - логинимся - выбираем книгу и отправляем ее в корзину - заходим и проверяем скидки
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=test&last_name=" +
                "test&email=user%40pflb.ru&password1=12345678&password2=12345678");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("5000");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMinValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(discountPercentMinValue, "7", "incorrect count percent");
        softAssert.assertEquals(discountMinValue$, "3500.0", "incorrect count discount");
        softAssert.assertEquals(totalMinValue, "46500.0", "incorrect total sum");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("9999");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMaxValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(discountPercentMaxValue, "7", "incorrect count percent");
        softAssert.assertEquals(discountMaxValue$, "6999.3", "incorrect count discount");
        softAssert.assertEquals(totalMaxValue, "92990.7", "incorrect total sum");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscountEightPercent() {
// регистрация - логинимся - выбираем книгу и отправляем ее в корзину - заходим и проверяем скидки
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=test&last_name=" +
                "test&email=user%40pflb.ru&password1=12345678&password2=12345678");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("10000");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMinValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMinValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(discountPercentMinValue, "8", "incorrect count percent");
        softAssert.assertEquals(discountMinValue$, "8000.0", "incorrect count discount");
        softAssert.assertEquals(totalMinValue, "92000.0", "incorrect total sum");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("15000");
        driver.findElement(By.cssSelector("[value = Update]")).click();
        String discountPercentMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountMaxValue$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalMaxValue = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(discountPercentMaxValue, "8", "incorrect count percent");
        softAssert.assertEquals(discountMaxValue$, "12000", "incorrect count discount");
        softAssert.assertEquals(totalMaxValue, "138000.0", "incorrect total sum");
        driver.quit();
        softAssert.assertAll();
    }
}