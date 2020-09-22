package com.company;

public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero(100, 35, "ускорение");
        Hero hero2 = new Hero(100, 35);
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setInjury(50);
        boss.setDefence("MAGIC");


        boss.printInfo();

    }
}
