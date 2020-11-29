package lesson1;

public class Robot implements Actions{

    protected Robot (int run, int jump){
    }

    public float jump(Wall wallNumber) {
        System.out.println("Робот подпрыгнул");
        return 0;
    }

    public int run() {
        System.out.println("Робот пробежал");
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
