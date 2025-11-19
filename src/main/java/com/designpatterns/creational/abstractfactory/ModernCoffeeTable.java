package com.designpatterns.creational.abstractfactory;


// 具体产品 A2: 现代咖啡桌
public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Putting coffee on a sleek, glass modern table.");
    }
}
