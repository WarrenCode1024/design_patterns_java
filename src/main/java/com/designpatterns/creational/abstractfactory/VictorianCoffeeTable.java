package com.designpatterns.creational.abstractfactory;

// 具体产品 B2: 复古咖啡桌
public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Putting coffee on a heavy, wooden Victorian table.");
    }
}