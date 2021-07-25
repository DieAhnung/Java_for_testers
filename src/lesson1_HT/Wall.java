package lesson1_HT;

/**
 * Объект препятствия стена
 */

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getParam() {
        return height;
    }
}

