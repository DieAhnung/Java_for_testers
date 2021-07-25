package Lesson3_HT;

public class Fruit {
    private float weight;
    private String type;

    Fruit(float weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public float getWeight() {
        return weight;
    }
}
