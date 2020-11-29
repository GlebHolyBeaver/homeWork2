package lesson1;

public class Human implements Actions {

    private int run;
    private int jump;
    private String name;

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public int getRun() {
        return 0;
    }

    protected Human (String name, int run, int jump){
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public String getName() {
        return "Человек по имени " + name;
    }
}
