package lesson1_HT;

/**
 * Интерфейс для участников забега
 */

public interface RunnerType {
    String getName();

    int getMaxDist();

    int getMaxHeight();

    void doIt(Obstacle obs);
}