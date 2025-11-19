package com.designpatterns.creational.abstractfactory;


// 具体产品 B1: 复古椅子
public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair with ornate carvings.");
    }
}
