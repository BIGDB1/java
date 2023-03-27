package pers.peng.learn.javase.reflect;

public class ReflectClassDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("pers.peng.learn.javase.reflect.ReflectClassDemo01");
        System.out.println(c1.getCanonicalName());
        Class c2 = Class.forName("[[Ljava.lang.String;");
        System.out.println(c2.getCanonicalName());
    }
}
