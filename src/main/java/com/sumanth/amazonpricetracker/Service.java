package com.sumanth.amazonpricetracker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Annotation
@org.springframework.stereotype.Service
public class Service {

    // Method
    // To compute factorial
    public String getPrice() {
        String productUrl = "https://www.amazon.in/OnePlus-Nord-Pastel-128GB-Storage/dp/B0BY8JZ22K/ref=sr_1_1?keywords=B0BY8JZ22K&qid=1692543631&sr=8-1";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode (no GUI)

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get(productUrl);
            WebElement divElement = driver.findElement(By.id("corePriceDisplay_desktop_feature_div"));

            System.out.println("Div Content: " + divElement.getText());
            return divElement.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return "NA";
        } finally {
            driver.quit();


        }


    }
}
