package lesson1;

public class Cat implements Actions{

    private int run;
    private int jump;
    private String name;

    protected Cat (String name, int run, int jump){
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public String getName() {
        return "Кот по кличке " + name;
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
