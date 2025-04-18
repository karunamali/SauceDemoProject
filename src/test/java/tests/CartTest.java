package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class CartTest extends BaseTest {

    @Test
    public void addItemToCart() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.cssSelector(".inventory_item button")).click();
        driver.findElement(By.className("shopping_cart_link")).click();

        boolean isItemInCart = driver.findElements(By.className("inventory_item_name")).size() > 0;
        Assert.assertTrue(isItemInCart, "Item not found in cart!");
    }
}
