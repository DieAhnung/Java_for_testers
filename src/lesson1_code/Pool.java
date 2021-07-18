package lesson1_code;

public class Pool {
    private double length;

    public Pool(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTimeToOvercomePool (CanSwim swimmer) {
        return swimmer.swim(this);

    }
}
