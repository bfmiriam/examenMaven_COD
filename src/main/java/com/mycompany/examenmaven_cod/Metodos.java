/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenmaven_cod;

import javax.swing.text.Document;
import javax.swing.text.Element;
import org.jsoup.Jsoup;

/**
 *
 * @author mbacelofernandez
 */
public class Metodos {

    public static void parsear() {

        String html = "<html><head><title>https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP</title></head>"
                + "<span class=\"\">10<sup>°</sup></span>";

        org.jsoup.nodes.Document doc = Jsoup.parse(html);

        org.jsoup.nodes.Element link = doc.select("a").first();

        String text = doc.body().text(); 
        String linkHref = link.attr("href"); 
        String linkText = link.text();

        String linkOuterH = link.outerHtml();
        String linkInnerH = link.html();
  
    }

}
