package pers.peng.learn.javase.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class ReflectMethodDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // 返回所有方法
        Method[] methods = System.class.getDeclaredMethods();
        System.out.println("length : " + methods.length);
        for (Method method : methods) {
            System.out.println(method);
        }
        //返回所有public方法
        Method[] methods1 = System.class.getMethods();
        System.out.println("length : " + methods1.length);

        for (Method method : methods1) {
            System.out.println(method);
        }
        //利用 Method 的 invoke 方法调用 System.currentTimeMillis()
        Method method = System.class.getMethod("currentTimeMillis");

        System.out.println(method);
        System.out.println(method.invoke(null));

    }
}
