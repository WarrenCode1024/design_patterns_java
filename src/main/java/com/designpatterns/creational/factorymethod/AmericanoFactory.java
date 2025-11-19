package com.designpatterns.creational.factorymethod;


// 具体创建者 A：美式咖啡工坊
public class AmericanoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        // 专门创建美式咖啡
        return new Americano();
    }
}