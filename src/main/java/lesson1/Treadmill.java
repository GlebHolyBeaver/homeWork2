package lesson1;

public class Treadmill implements Obstacles {

    public int distance;
    public String name;

    protected Treadmill(String name, int distance){
        this.distance = distance;
        this.name = name;
    }

    @Override
    public boolean doIt(Actions actions) {
        if (actions.getRun() >= distance) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
