package lesson1_HT;

public class Main {

    public static void main(String[] args) {


        Human human1 = new Human("Alex", 400, 1);
        Cat cat1 = new Cat("Bucky", 400, 3);
        Robot robot1 = new Robot("Wall-e", 3500, 0);

        //массив объектов
        RunnerType[] runnres = {human1, cat1, robot1};
        Obstacle[] obstacles = {new Wall(1), new Runningtrack(150),
                new Wall(2), new Wall(1), new Runningtrack(600)};


        for (RunnerType r : runnres) {
            System.out.println(r.getName() + " starts running");
            for (Obstacle track : obstacles) {
                r.doIt(track); // просим объект преодолеть препятствие
            }
            System.out.println(r.getName() + " finished his race");
        }

    }

}
