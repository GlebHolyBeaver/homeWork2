package lesson1;

public class Wall implements Obstacles{

    public int height;

    protected Wall(int height){
        this.height = height;
    }

    @Override
    public boolean doIt(Actions actions) {
        if (actions.getJump() >= height) {
            return true;
        }
        return false;
    }
}
