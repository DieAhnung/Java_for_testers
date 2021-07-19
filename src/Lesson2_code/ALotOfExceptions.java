package Lesson2_code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ALotOfExceptions {
    public static void main(String[] args) {

        try {
          test();
            int a = 1 / 0;
            InputStream inputStream = new FileInputStream("aaaaa");
        } catch (Throwable exception) {
            // exception.printStackTrace();
        }

        System.out.println("alive");


    }

    public static void test() {
        test();
    }
}
