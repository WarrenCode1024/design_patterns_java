package com.designpatterns.creational.abstractfactory;


// 具体产品 A1: 现代椅子
public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern, minimalist chair.");
    }
}
