package com.designpatterns.creational.factorymethod;

// 具体产品 A：美式咖啡
public class Americano implements Coffee {
    @Override
    public void prepare(){
        System.out.println("Preparing Americano: Adding espresso and hot water");
    }

}
