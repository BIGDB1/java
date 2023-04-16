package pers.peng.learn.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectMethodConstructorDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] constructor = String.class.getDeclaredConstructors();

        System.out.println(constructor.length);
        for (Constructor<?> c : constructor) {
            System.out.println(c);
        }

        Constructor<?>[] constructor1 = String.class.getConstructors();

        System.out.println(constructor1.length);
        for (Constructor<?> c : constructor1) {
            System.out.println(c);
        }

        System.out.println("============================");

        Constructor<?> constructor2 = String.class.getConstructor(String.class);
        System.out.println(constructor2);

        String str = (String) constructor2.newInstance("bbb");

        System.out.println(str);


    }
}
