package com.sumanth.amazonpricetracker;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

// Annotation
@org.springframework.stereotype.Service
public class Service {

    public String getPrice() {
        try {
            String amazonUrl = "https://www.amazon.in/London-Hills-Solid-Sleeve-T-Shirt/dp/B07FLCYKPS/ref=sr_1_1?crid=Y9OFYZJI09KC&keywords=B07FLCYKPS&qid=1693655943&s=apparel&sprefix=b07flcykps%2Capparel%2C284&sr=1-1&th=1&psc=1";

            List<String> userAgentList = new ArrayList<>();

            userAgentList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36 RuxitSynthetic/1.0 v2305132984804220999 t4086402995496916773 ath1fb31b7a altpriv cvcv=2 smf=0");
            userAgentList.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36 RuxitSynthetic/1.0 v16807890662 t5210748740893937515 athfa3c3975 altpub cvcv=2 smf=0");
            userAgentList.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.164 Safari/537.36 RuxitSynthetic/1.0 v5069073091369417708 t9087787659855017555 ath2653ab72 altpriv cvcv=2 smf=0");
            userAgentList.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36 RuxitSynthetic/1.0 v681909258870723598 t2757286289297744789 ath259cea6f altpriv cvcv=2 smf=0");
            userAgentList.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36 RuxitSynthetic/1.0 v1669153918155230333 t5311872177413310524 ath2653ab72 altpriv cvcv=2 smf=0");
            userAgentList.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36 RuxitSynthetic/1.0 v5431912926 t2919988779936565396 athfa3c3975 altpub cvcv=2 smf=0");
            userAgentList.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36 RuxitSynthetic/1.0 v9137315398454144680 t893032105033930323 ath93eb305d altpriv cvcv=2 smf=0");
            userAgentList.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36 RuxitSynthetic/1.0 v879511236940769489 t7073984361851589466 ath5ee645e0 altpriv cvcv=2 smf=0");
            userAgentList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36 RuxitSynthetic/1.0 v9172961946891371836 t927596325496327878 ath1fb31b7a altpriv cvcv=2 smf=0");
            userAgentList.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36");

            Connection.Response initialResponse = Jsoup.connect("https://amazon.in")
                    .method(Connection.Method.GET)
                    .execute();

            Map<String, String> cookies = initialResponse.cookies();


            Random random = new Random();
            int randomIndex = random.nextInt(userAgentList.size());

            Document doc = Jsoup
                    .connect(amazonUrl)
                    .userAgent(userAgentList.get(randomIndex))
                    .header("Accept-Language", "en-US,en;q=0.9")
                    .referrer("https://www.google.com/")
                    .cookies(cookies)
                    .get();
            Element spanElement = doc.getElementById("a-price-whole");
            System.out.println("price : " + spanElement);
            return doc.outerHtml();
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
    }
}
