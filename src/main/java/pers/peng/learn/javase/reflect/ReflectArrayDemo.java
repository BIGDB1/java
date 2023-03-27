package pers.peng.learn.javase.reflect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class ReflectArrayDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.Integer");
        Object array = Array.newInstance(cls, 25);

        Array.set(array, 0, 2);
        Array.set(array, 1, 12);


        System.out.println(Array.get(array, 1));
    }
}
