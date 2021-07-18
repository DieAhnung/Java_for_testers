package lesson1_HT;

/**
 * Объект препятствия беговая дистанция
 */

public class Runningtrack implements Obstacle{

    private int distance;

    public Runningtrack(int distance) {
        this.distance = distance;
    }

    public int getParam() {
        return distance;
    }


}