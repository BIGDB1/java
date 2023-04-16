package pers.peng.learn.javase.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamDemo {
    public static void main(String[] args) {
        String hey = "HELLO WORLD";
        ByteArrayInputStream input = new ByteArrayInputStream(hey.getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int i = 0;
        while ((i = input.read()) != -1) {
            char c = (char) i;
            output.write(Character.toLowerCase(c));
        }

        String newStr = output.toString();
        try {
            output.close();
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(newStr);

    }
}
