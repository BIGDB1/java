package pers.peng.learn.javase.reflect;

public class ReflectClassDemo02 {
    public static void main(String[] args) {
        Class c1 = Double.class;
        System.out.println(c1.getCanonicalName());

        Class c2 = ReflectClassDemo02.class;
        System.out.println(c2.getCanonicalName());
    }
}
