package com.designpatterns.creational.abstractfactory;

// 抽象工厂：定义创建一组相关产品的方法
public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
}