package com.roshan.news_scrape;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	 final Document document = Jsoup.connect("https://thehimalayantimes.com/?s=kathmandu").get();
   
 
      for (Element row : document.select("ul.mainNews")) {

            final String date = row.select("small.postMeta").text();
    	       
    	 
           
             System.out.println(date);
          
             
         }
      
      
      
      
      
    	 
    }
}
