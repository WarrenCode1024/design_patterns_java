package com.designpatterns.creational.abstractfactory;

public class AbstractFactoryClient {

    public static void assembleFurniture(FurnitureFactory factory) {
        System.out.println("--- Assembling a new set of furniture ---");

        // 客户端通过工厂创建一组产品
        Chair chair = factory.createChair();
        CoffeeTable table = factory.createCoffeeTable();

        // 使用产品（客户端只知道产品实现了 Chair 和 CoffeeTable 接口）
        chair.sitOn();
        table.putCoffee();

        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        // 场景 1: 需要现代风格家具
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        assembleFurniture(modernFactory); // 创建并使用 ModernChair 和 ModernCoffeeTable

        // 场景 2: 需要复古风格家具
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        assembleFurniture(victorianFactory); // 创建并使用 VictorianChair 和 VictorianCoffeeTable
    }
}
