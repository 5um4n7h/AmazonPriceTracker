package com.sumanth.amazonpricetracker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class AmazonPriceTrackerApplication {

	public static void main(String[] args) {

		SpringApplication.run(AmazonPriceTrackerApplication.class, args);
//		String productUrl = "https://www.amazon.in/OnePlus-Nord-Pastel-128GB-Storage/dp/B0BY8JZ22K/ref=sr_1_1?keywords=B0BY8JZ22K&qid=1692543631&sr=8-1";
//
//		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless"); // Run in headless mode (no GUI)
//
//		WebDriver driver = new ChromeDriver(options);
//
//		try {
//			driver.get(productUrl);
//
//			// Find the element that contains the price information using the span class
//			WebElement priceElement = driver.findElement(By.className("a-offscreen"));
//
//			if (priceElement != null) {
//				String productPrice = priceElement.getText();
//				System.out.println("Product Price: " + productPrice);
//			} else {
//				System.out.println("Price not found.");
//			}
//
//			WebElement divElement = driver.findElement(By.id("corePriceDisplay_desktop_feature_div"));
//
//			// Now you can work with the div element
//			System.out.println("Div Content: " + divElement.getText());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}  finally {
//		driver.quit();
//	}


	}

}
