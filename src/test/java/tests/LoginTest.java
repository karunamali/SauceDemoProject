package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.ExcelUtil;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData")
    public void loginWithMultipleUsers(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        // Handle the locked_out_user case
        if (username.equals("locked_out_user")) {
            WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
            Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed for locked_out_user.");
            Assert.assertEquals(errorMessage.getText(), "Epic sadface: Sorry, this user has been locked out.");
            return;  // Skip the home page validation for locked_out_user
        }

        // For other users, check if the homepage is displayed
        boolean isHomePageDisplayed = driver.getCurrentUrl().contains("inventory");
        Assert.assertTrue(isHomePageDisplayed, "Login failed for user: " + username);
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        String path = "src/test/resources/LoginData.xlsx";
        return ExcelUtil.getLoginData(path, "Sheet1");
    }
}
