package lesson1;

public class Wall implements Obstacles{

    public int height;
    public String name;

    protected Wall(String name, int height){
        this.height = height;
        this.name = name;
    }

    @Override
    public boolean doIt(Actions actions) {
        if (actions.getJump() >= height) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
