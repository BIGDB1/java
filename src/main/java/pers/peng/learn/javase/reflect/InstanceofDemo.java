package pers.peng.learn.javase.reflect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InstanceofDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        if (List.class.isInstance(list)) {
            System.out.println("yes");
        }
    }
}
