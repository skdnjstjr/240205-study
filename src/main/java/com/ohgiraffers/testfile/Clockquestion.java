package com.ohgiraffers.testfile;

public class Clockquestion {

    public static void main(String[] args) {

        Clockquestion.method(3690);

    }
    public static void method(int second) {

        int hour = second/3600;     // hour = 1
        second = second%3600;       // 현재 second = 90
        int minute = second/60;     // minute = 1
        second = second%60;         // 현재 second =30
        System.out.println(hour+"시간"+minute+"분"+second+"초");



    }
}
