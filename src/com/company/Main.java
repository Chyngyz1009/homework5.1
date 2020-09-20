package com.company;

public class Main {

    public static void main(String[] args) {

       Hero hero= new Hero(100,35,"ускорение");
       Hero hero2= new Hero(100,35);

       Boss  boss= new Boss(150,40,"magican");
       boss.printInfo();
    }
}
