package com.sumanth.amazonpricetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class AmazonPriceTrackerApplication {

	public static void main(String[] args) {

		SpringApplication.run(AmazonPriceTrackerApplication.class, args);
		String productUrl = "https://www.amazon.in/OnePlus-Nord-Pastel-128GB-Storage/dp/B0BY8JZ22K/ref=sr_1_1?keywords=B0BY8JZ22K&qid=1692543631&sr=8-1";

//		try {
//			Document document = Jsoup.connect(productUrl).get();
//
//			// Find the element that contains the price information
//			// Use the class name "a-price-whole" to target the price
//			Element priceElement = document.select("span.a-price > span.a-offscreen").first();
//			System.out.println(priceElement);
//
//			if (priceElement != null) {
//				String productPrice = priceElement.text();
//				System.out.println("Product Price: " + productPrice);
//			} else {
//				System.out.println("Price not found.");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		try {
//			Document document = Jsoup.connect(productUrl).get();
//			String pageContent = document.outerHtml(); // Get the entire HTML content
//			System.out.println(pageContent);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}


	}

}
