package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class FilterTest extends BaseTest {

    @Test
    public void filterProductsLowToHigh() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement dropdown = driver.findElement(By.className("product_sort_container"));
        dropdown.sendKeys("Price (low to high)");

        List<WebElement> items = driver.findElements(By.className("inventory_item_name"));
        System.out.println("Products after sorting Low to High:");
        for (WebElement item : items) {
            System.out.println(item.getText());
        }
    }
}
