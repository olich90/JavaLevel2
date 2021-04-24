package homework1;

public class Human implements Moveable {
    private final String name;
    private final int runLimit;
    private final int jumpLimit;

    public Human(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() { return name; }
    public int getRunLimit() { return runLimit; }
    public int getJumpLimit() {
        return jumpLimit;
    }

    // Сначала было так, потом вспомнил про DRY (don't repeat yourself) и вынес логику в default-методы интерфейса
    /*
    @Override
    public int run(Hurdle hurdle) {
        if (hurdle.getValue() > runLimit) {
            System.out.println(name + " не может пробежать на дорожке длину " + hurdle.getValue() + ", его предел в беге = " + runLimit + ". " + name + " сошел с дистанции");
            return -1;
        } else {
            System.out.println(name + " пробежал на дорожке длину " + hurdle.getValue());
            return 0;
        }
    }

    @Override
    public int jump(Hurdle hurdle) {
        if (hurdle.getValue() > jumpLimit) {
            System.out.println(name + " не может перепрыгнуть стену высотой " + hurdle.getValue() + ", его предел в прыжках = " + jumpLimit + ". " + name + " сошел с дистанции");
            return -1;
        } else {
            System.out.println(name + " перепрыгнул стену высотой " + hurdle.getValue());
            return 0;
        }
    }
    */
}