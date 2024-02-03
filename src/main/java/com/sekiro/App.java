package com.sekiro;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        String url = "https://books.toscrape.com/";

        try{
            Document document = Jsoup.connect(url).get();

            Elements shoes = document.select(".product_pod");

            for(Element shoe : shoes){
                String brand = shoe.select("h3 > a").text();


                System.out.println(brand);
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
