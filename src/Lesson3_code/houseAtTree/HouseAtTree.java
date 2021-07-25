package Lesson3_code.houseAtTree;

public class HouseAtTree<T extends Animal & Flyable> {
    private T master;

    public HouseAtTree(T master) {
        this.master = master;
    }

    public T getMaster() {
        return master;
    }

    public void setMaster(T master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "HouseAtTree{" +
                "master=" + master +
                '}';
    }

    public static void main(String[] args) {
        //HouseAtTree<Cat> catHouseAtTree = new HouseAtTree<>(new Cat());

        HouseAtTree<Bird> birdHouseAtTre = new HouseAtTree<>(new Bird());



    }
}
