package lesson1;


public class MainClass {
    public static void main(String[] args) {
        Actions[] sportsman = new Actions[3];
        sportsman[0] = new Human("Егор", 200, 1);
        sportsman[1] = new Robot("XR3000",1000, 5);
        sportsman[2] = new Cat("Барсик",250, 2);

        Obstacles[] obstacles = new Obstacles[3];
        obstacles[0] = new Wall("Стена номер 1",2);
        obstacles[1] = new Treadmill("Дорожка номер 1", 300);
        obstacles[2] = new Treadmill("Дорожка номер 2", 250);

        for (int i = 0; i < sportsman.length; i++){
            System.out.println();
            for (int f = 0; f < obstacles.length; f++) {
                if (obstacles[f].doIt(sportsman[i])) {
                    System.out.println(sportsman[i].getName() + " преодолел препятсвие " + obstacles[f].getName());
                } else {
                    System.out.println(sportsman[i].getName() + " не смог преодолел препятсвие " + obstacles[f].getName());
                    break;
                }
            }
        }

        // для одиночных испытаний

//        if (obstacles[0].doIt(sportsman[1])) {
//            System.out.println(sportsman[1].getName() + " перепрыгнул стену");
//        } else {
//            System.out.println(sportsman[1].getName() + " не смог перепрыгнуть стену");
//        }
//
//        if (obstacles[1].doIt(sportsman[2])) {
//            System.out.println(sportsman[2].getName() + " пробежал дистанцию");
//        } else {
//            System.out.println(sportsman[2].getName() + " не смог пробежать дистанцию");
//        }
    }
}
