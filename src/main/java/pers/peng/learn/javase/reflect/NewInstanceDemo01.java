package pers.peng.learn.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceDemo01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c1 = String.class;
        String str = (String) c1.newInstance();
        str = "hello";
        System.out.println(str);

        //获得String所对应的Class对象
        Class<?> c2 = String.class;
        //获得String类带一个String参数的构造器
        Constructor constructor = c2.getConstructor(String.class);
        //根据构造器创建实例
        String str1 = (String) constructor.newInstance("world");

        System.out.println(str1);
    }
}
