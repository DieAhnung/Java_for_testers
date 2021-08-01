package Lesson5_HT;


import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = {{123, 456, 789}, {987, 654, 321}};
        AppData appData = new AppData(header, data);

        AppData.writeFile("file.csv");
        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        AppData.readFile("file_1.csv");
        System.out.println(AppData.readFile("file_1.csv"));


    }

}
