package pers.peng.learn.javase.io;

import java.io.*;

public class FileStreamDemo {
    private static final String FILEPATH = "temp.log";

    public static void main(String[] args) throws IOException {
        write(FILEPATH);
        read(FILEPATH);
    }

    public static void write(String filepath) throws IOException {
        File file = new File(filepath);

        OutputStream output = new FileOutputStream(file);

        String t = "HelloWorld\n";

        byte[] bytes = t.getBytes();

        output.write(bytes);

        output.close();

    }

    private static void read(String filepath) throws IOException {
        File file = new File(filepath);

        InputStream input = new FileInputStream(file);

        byte[] bytes = new byte[(int) file.length()];

        int len = input.read(bytes);

        System.out.println("长度为：" + len);

        input.close();

        System.out.println(new String(bytes));
    }
}
