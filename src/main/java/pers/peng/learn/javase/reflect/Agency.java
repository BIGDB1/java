package pers.peng.learn.javase.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Agency implements InvocationHandler {
    private Object onePerson;

    public Agency(Object onePerson) {
        this.onePerson = onePerson;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = method.invoke(onePerson, args);
        return obj;
    }
}
