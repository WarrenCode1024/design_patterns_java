package com.designpatterns.creational.simplefactory;


// 简单工厂：负责生产所有咖啡
public class SimpleCoffeeFactory {
    // 静态方法，根据类型字符串创建对象
    public static Coffee createCoffee(String type) {
        if ("Americano".equalsIgnoreCase(type)) {
            return new Americano();
        } else if ("Latte".equalsIgnoreCase(type)) {
            return new Latte();
        } else {
            // 抛出异常或返回 null
            throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}