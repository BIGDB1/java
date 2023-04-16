package pers.peng.learn.javase.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FastCopy {
    public static final String src = "temp.log";
    public static final String dist = "temp1.log";

    public static void main(String[] args) throws IOException {
        copy("temp.log", "temp1.log");
    }

    public static void copy(String src, String dist) throws IOException {

        FileInputStream input = new FileInputStream(src);
        FileChannel channel = input.getChannel();

        FileOutputStream output = new FileOutputStream(dist);
        FileChannel channel1 = output.getChannel();

        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

        while (true) {
            int i = channel.read(buffer);
            if (i == -1) {
                break;
            }
            buffer.flip();
            channel1.write(buffer);
            buffer.clear();
        }
    }
}
