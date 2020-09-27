package com.nekrasov.botMichael.logics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BotLogics {
    public static void main(String[] args) throws Exception{
        start();
    }

    public static void start() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("-Напишите Майклу 'Привет': ");

        String userText =reader.readLine();
        String a = "Привет";

        if (userText.equals(a)) {
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
    public static void action() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String action1 = "[1.Рассказать стихотворение:] ";
        String action2 = "[2.Прогноз погоды:] ";
        String action3 = "[3.Курс USD/EUR:] ";

        System.out.println(action1+action2+action3);
        int b = Integer.parseInt(reader.readLine());
        int a = 1;
        if (b == a) {
            stih();
        }
        // if (b != a){
        //  weather();
    }

}

//   }