package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class CheckOutTest extends BaseTest {

    @Test
    public void completePurchase() {
        // Step 1: Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Step 2: Add to cart
        driver.findElement(By.cssSelector(".inventory_item button")).click();

        // Step 3: Go to cart page
        driver.findElement(By.className("shopping_cart_link")).click();

        // Step 4: Click checkout (this was missing before)
        driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();

        // Step 5: Fill checkout form
        driver.findElement(By.id("first-name")).sendKeys("Karuna");
        driver.findElement(By.id("last-name")).sendKeys("Mali");
        driver.findElement(By.id("postal-code")).sendKeys("411001");

        // Step 6: Continue and finish
        driver.findElement(By.cssSelector("input[value='CONTINUE']")).click();
        driver.findElement(By.cssSelector(".btn_action.cart_button")).click();

        // Step 7: Validate order confirmation
        String confirmation = driver.findElement(By.className("complete-header")).getText();
        Assert.assertEquals(confirmation, "THANK YOU FOR YOUR ORDER");
    }
}
