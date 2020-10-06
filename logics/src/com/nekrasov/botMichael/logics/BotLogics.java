package com.nekrasov.botMichael.logics;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class BotLogics {
    public static void main(String[] args) throws Exception{
        start();
    }

    public static void start() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("-Напишите Майклу 'Привет': ");

        String userText = reader.readLine();

        String hiList = "Привет";

        if (userText.equals(hiList)) {
            System.out.println("-Привет, друг! Как тебя зовут?(Напиши свое имя ниже):");
            met();
        } else {
            System.out.println("==Майкл не будет с тобой общаться, пока не напишешь ему 'Привет'!==");
            start();
        }

    }

    public static void met() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();


        System.out.println("-Мне очень приятно, " + input + "!!!");
        System.out.println("-Меня зовут Майкл и я буду твоим личным помощником:)");
        System.out.println("-Выбери действие из списка и я его выполню:");

        action();


    }
    public static void stih() throws Exception{
        String pushkin = "==Я вас любил: любовь еще, быть может,==\n" +
                "==В душе моей угасла не совсем;==\n" +
                "==Но пусть она вас больше не тревожит;==\n" +
                "==Я не хочу печалить вас ничем.==\n" +
                "==Я вас любил безмолвно, безнадежно,==\n" +
                "==То робостью, то ревностью томим;==\n" +
                "==Я вас любил так искренно, так нежно,==\n" +
                "==Как дай вам бог любимой быть другим.==";
        System.out.println(pushkin);
        System.out.println("---КАКОЕ ДЕЙСТВИЕ ВЫПОЛНИТЬ СЛЕДУЮЩИМ?---");
        action();
    }
    public static void action() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String action1 = "[1.Рассказать стихотворение:] ";
        String action2 = "[2.Прогноз погоды:] ";
        String action3 = "[3.Курс USD/EUR:] ";

        System.out.println(action1 + action2 + action3);
        int b = Integer.parseInt(reader.readLine());
        int a = 1;
        if (b == a) {
            stih();
        }
        if (b != a) {
            Devjatnadcat1();
        }
    }

    public static void Devjatnadcat1() throws IOException {

            List<Article> articleList = new ArrayList<>();
            Document doc = Jsoup.connect("https://rp5.ru/%D0%9F%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0_%D0%B2_%D0%A0%D0%BE%D1%81%D1%82%D0%BE%D0%B2%D0%B5-%D0%BD%D0%B0-%D0%94%D0%BE%D0%BD%D1%83").get();

            Elements trElements = doc.getElementsByAttributeValue("class", "b-table_row b-forecast");
            trElements.forEach(trElement ->{
                Elements elementsByClass = trElement.getElementsByClass("b-table_cell");
                System.out.print(elementsByClass.get(0).text() + " ");
               
                Element element = elementsByClass.get(1);
                String temp = element.getElementsByClass("b-forecast_temp").text();
                String precipitation = element.getElementsByClass("b-forecast_description").text();
                System.out.println(temp + " " + precipitation);
            });


    }
    class Article{
        private String url;
        private String name;

        public Article(String url,String name){
            this.url=url;
            this.name=name;
        }
        public String getUrl(){
            return url;
        }
        public void setUrl(){
            this.url=url;
        }
        public String getName(){
            return name;
        }
        public void setName(){
            this.name=name;
        }
    }
    }



