package lesson1;

import java.util.concurrent.Callable;

public class MainClass {
    public static void main(String[] args) {
        Actions human1 = new Human("Егор", 200, 1);
        Robot robot1 = new Robot(1000, 3);
        Cat cat1 = new Cat(250, 2);
        Obstacles wall1 = new Wall(10);
        if (wall1.doIt(human1)) {
            System.out.println(human1.getName() + " Win");
        } else {
            System.out.println(human1.getName() + " Проебал");
        }
    }
}
