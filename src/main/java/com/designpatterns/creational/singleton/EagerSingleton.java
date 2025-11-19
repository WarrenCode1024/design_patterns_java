package com.designpatterns.creational.singleton;


// 单例模式 饿汉式（Eager Initialization）

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        if(instance != null){
            throw new RuntimeException("EagerSingleton already instantiated");
        }
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
