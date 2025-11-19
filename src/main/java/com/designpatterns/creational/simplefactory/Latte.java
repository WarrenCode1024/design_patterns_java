package com.designpatterns.creational.simplefactory;

// 具体产品 B：拿铁咖啡
public class Latte implements Coffee{
    @Override
    public void prepare(){
        System.out.println("Preparing Latte: Adding espresso, steamed milk, and foam.");
    }
}
