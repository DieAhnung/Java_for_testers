package Lesson5_HT;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData {

    private static String[] header;
    private static int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }


    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.toString(header) +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    protected static void writeFile(String fileName) {
        try (PrintWriter out = new PrintWriter(fileName)) {
            for (String v : header) {
                out.print(v + ";");
            }
            out.println();

            int[][] valListData = data;
            for (int i = 0; i < valListData.length; i++) {
                for (int j = 0; j < valListData[i].length; j++) {
                    out.print(valListData[i][j] + ";");
                }
                out.write("\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected static AppData readFile(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        List<int[]> data = new ArrayList<>();
        String[] dataHead = in.readLine().split(";");
        String line = null;
        while ((line = in.readLine()) != null) {
            List<Integer> list = new ArrayList<>();
            String[] string = line.split(";");
            for (int i = 0; i < string.length; i++) {
                list.add(Integer.parseInt(string[i]));
            }
            data.add(list.stream().mapToInt(i -> i).toArray());
        }
        AppData appData = new AppData(dataHead, data.toArray(new int[0][]));
        int[][] array = appData.getData();
        return appData;
    }

}
