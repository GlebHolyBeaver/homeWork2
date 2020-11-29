package lesson1;

public class Robot implements Actions{

    private int run;
    private int jump;
    private String name;

    protected Robot (String name, int run, int jump){
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public String getName() {
        return "Робот с названием " + name;
    }

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public int getRun() {
        return run;
    }
}
