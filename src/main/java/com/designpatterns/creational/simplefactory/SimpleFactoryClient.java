package com.designpatterns.creational.simplefactory;


public class SimpleFactoryClient {
    public static void main(String[] args) {
        // 客户端不直接使用 new 关键字创建具体产品
        Coffee myAmericano = SimpleCoffeeFactory.createCoffee("Americano");
        myAmericano.prepare();

        Coffee myLatte = SimpleCoffeeFactory.createCoffee("Latte");
        myLatte.prepare();
    }
}