package com.designpatterns.creational.factorymethod;


public class FactoryMethodClient {
    public static void main(String[] args) {
        // 客户端创建特定的工厂对象
        CoffeeFactory americanoFactory = new AmericanoFactory();
        CoffeeFactory latteFactory = new LatteFactory();

        // 客户端通过工厂对象来获取产品
        System.out.println("--- Ordering Americano ---");
        americanoFactory.deliverCoffee();

        System.out.println("\n--- Ordering Latte ---");
        latteFactory.deliverCoffee();

        // 扩展性体现：如果新增一种摩卡咖啡 (Mocha)，
        // 只需创建 Mocha 类和 MochaFactory 类，无需修改任何现有代码。
    }
}