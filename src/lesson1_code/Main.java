package lesson1_code;

import static lesson1_code.Utils.makeAnimalOlder;

public class Main<catCompetitor> {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Fluffy", "white", 1);

        System.out.println(cat1);

        Cat cat2 = new Cat("Bucky", "Black", 2);

        Cat cat3 = new Cat("Bucky", "Black", 2);

        System.out.println(cat2.equals(cat3));

        Wolf wolf1 = new Wolf("Wolf", "gray", 2);

        Animal cat4 = new Cat("Binky", "blackAndWhite", 3);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        } else {
            System.out.println("Wrong type");
        }

        Animal cat6 = new Cat("BinkyJr", "red", 4);
        cat6.voice();


        //Создать набор бассейнов и заставить животных проплыть по ним и высести время на заплыв.

        Cat catCompetitor = new Cat("FluffyJr", "white", 1);
        catCompetitor.setSwimmSpeed(10);
        Wolf wolfCompetitor = new Wolf("WolfJr", "gray", 14);
        wolfCompetitor.setSwimmSpeed(12);
        Turtle turtleCompetitor = new Turtle("turtleCompetitor", "turtle", 99);
        turtleCompetitor.setSwimmSpeed(15);

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};

        for (Pool pool : pools) {
            pool.getTimeToOvercomePool(catCompetitor);
            pool.getTimeToOvercomePool(wolfCompetitor);
            pool.getTimeToOvercomePool(turtleCompetitor);

        }

        makeAnimalOlder(cat2);

    }
}

