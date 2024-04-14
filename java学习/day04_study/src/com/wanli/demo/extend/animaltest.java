package com.wanli.demo.extend;

/**
 * @author 万里@date 2024-01-17 17:29@version 1.0目前正在开发中...
 */
public class animaltest {
    public static void main(String[] args) {
        cat cat1 = new cat();
        System.out.println(cat1.name);
        System.out.println(cat1.eat());
        System.out.println(cat1.run());
        System.out.println(cat1.toString());
        Dog dog1 = new Dog();
        System.out.println(dog1.run());
        dog1.name = "酸菜泡豆皮汤";
        System.out.println(dog1.name);
    }

}
