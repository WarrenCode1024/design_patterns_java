package com.designpatterns.creational.singleton;

// 枚举单例（Enum Singleton）
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Doing something...");
    }
}
