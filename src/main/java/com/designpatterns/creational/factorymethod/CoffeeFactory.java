package com.designpatterns.creational.factorymethod;


// 抽象创建者：咖啡工坊的抽象接口
public abstract class CoffeeFactory {
    // 抽象的工厂方法，留给子类实现
    public abstract Coffee createCoffee();

    // 可以包含与产品无关的业务逻辑
    public void deliverCoffee() {
        Coffee coffee = createCoffee(); // 调用工厂方法
        coffee.prepare();
        System.out.println("Coffee delivered! Enjoy.");
    }
}