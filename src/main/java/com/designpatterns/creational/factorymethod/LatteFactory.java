package com.designpatterns.creational.factorymethod;


// 具体创建者 B：拿铁咖啡工坊
public class LatteFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        // 专门创建拿铁咖啡
        return new Latte();
    }
}