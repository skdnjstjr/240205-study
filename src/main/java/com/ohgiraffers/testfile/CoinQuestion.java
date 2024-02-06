package com.ohgiraffers.testfile;

public class CoinQuestion {

    public static void main(String[] args){
        CoinQuestion.method(770);
    }
    public static void method(int x) {
        int coin500 = x / 500;
        x %= 500;
        int coin100 = x / 100;
        x %= 100;
        int coin50 = x / 50;
        x %= 50;
        int coin10 = x / 10;
        x %= 10;
        int numOfCoins = coin500 + coin100 + coin50 + coin10;
        System.out.println(numOfCoins);
    }

    }
