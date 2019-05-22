package com.haoqiang.homework_May22;

public class MainFunction {


    public static void main(String[] args) {
        Bike bike = new Bike("round",2,"triangle");
        System.out.println(bike.toString());

        Bicycle bicycle = new Bicycle("round",2,"triangle",2);
        System.out.println(bicycle.toString());

        Motorcycle motorcycle = new Motorcycle("round",2,"rectangle",2,"#1","#2");
        System.out.println(motorcycle.toString());
    }

}
