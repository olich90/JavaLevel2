package homework1;

public interface Moveable {
    String getName();
    int getRunLimit();
    int getJumpLimit();

    default int run(Hurdle hurdle, String name, int runLimit) {
        if (hurdle.getValue() > runLimit) {
            System.out.println(name + " не смог пробежать на дорожке длину = " + hurdle.getValue() + ", его предел в беге = " + runLimit + ". " + name + " сошел с дистанции.");
            return -1;
        } else {
            System.out.println(name + " пробежал на дорожке длину = " + hurdle.getValue());
            return 0;
        }
    }

    default int jump(Hurdle hurdle, String name, int jumpLimit) {
        if (hurdle.getValue() > jumpLimit) {
            System.out.println(name + " не смог перепрыгнуть стену высотой = " + hurdle.getValue() + ", его предел в прыжках = " + jumpLimit + ". " + name + " сошел с дистанции.");
            return -1;
        } else {
            System.out.println(name + " перепрыгнул стену высотой = " + hurdle.getValue());
            return 0;
        }
    }
}