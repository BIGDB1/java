package pers.peng.learn.javase.reflect;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        PeopleWhoLookingHouse phs = new PeopleWhoLookingHouse();
        InvocationHandler handler = new Agency(phs);
        
        RentingHouse rth = (RentingHouse) Proxy.newProxyInstance(handler.getClass().getClassLoader(), phs.getClass().getInterfaces(), handler);

        rth.findHouse();
    }
}
