package com.example.sitescraping

import org.jsoup.Jsoup

fun main() {

    val doc = Jsoup.connect("https://confluence.allaboutapps.at/#all-updates").get()
    doc.run {
        select("body").forEachIndexed { index, element ->
            val list = element.select("ul.list-container list-container-all-updates")
            val selected = list.select("h4")
            println("$index. ${element.text()}, $selected")
            //println("$img")
        }
        print("test")
    }
    //println(doc)

}
