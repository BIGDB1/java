package pers.peng.learn.javase.reflect;

import java.util.ArrayList;
import java.util.List;

public class ReflectClassDemo03 {
    enum E {a, b}
    public static void main(String[] args) {
        Class c1 = "noob".getClass();
        System.out.println(c1.getCanonicalName());

        Class c2 = ReflectClassDemo03.E.a.getClass();
        System.out.println(c2.getCanonicalName());

        List<String> list = new ArrayList<>();
        Class c3 = list.getClass();
        System.out.println(c3.getCanonicalName());
    }
}
