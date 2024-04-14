package com.wanli.demo;

import com.wanli.demo.test.people;

/**
 * @author 万里@date 2024-01-17 18:28@version 1.0目前正在开发中...
 */
public class demo02 {
    public static void main(String[] args) {
        //无参构造
        people p1 = new people();
        System.out.println(p1.toString());
        p1.setName("张三");
        p1.setAge(18);
        p1.setAddress("镇江");
        p1.setSalary(5000);
        p1.setHobby("篮球");
        //有参构造 创建五个实例对象
        people p2 = new people("李四",20,3000,"镇江","音乐");
        people p3 = new people("王五",-10,8000,"徐州","敲代码");
        people p4 = new people("赵六",30,7000,"苏州","跳舞");
        people p5 = new people("马七",40,5000,"无锡","唱歌");
        people p6 = new people("田八",20,8000,"常州","rap");
        //将对象添加数组中，引入数据类型自定义的类定义数组
        people[] people = {p1,p2,p3,p4,p5,p6};
        //遍历所有员工对象
        System.out.println("薪水大于5000:");
        for (people data:people
             ) {
            if (data.getSalary()>5000){
                System.out.println(data.getName());
            }

        }
    }
}
