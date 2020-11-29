package lesson1;

public class Cat implements Actions{

    protected Cat (int run, int jump){
    }

    public float jump(Wall wallNumber) {
        System.out.println("Кот подпрыгнул");
        return 0;
    }

    public int run() {
        System.out.println("Кот пробежал");
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getJump() {
        return 0;
    }

    @Override
    public int getRun() {
        return 0;
    }
}
