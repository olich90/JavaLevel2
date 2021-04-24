package homework1;

public class Main {
    public static void main(String[] args) {
        // Массив участников
        Moveable[] moveables = {
                new Human("Вася", 1000, 2),
                new Cat("Мурзик", 100, 1),
                new Robot("Робокоп", 50000, 3)
        };

        // Массив препятствий
        Hurdle[] hurdles = {
                new Treadmill(5000),
                new Wall(2),
                new Wall(1),
                new Wall(4),
                new Treadmill(50000),
        };

        for (Moveable moveable : moveables) {
            for (Hurdle hurdle : hurdles) {
                if (hurdle instanceof Treadmill) { // Если препятсвие - дорожка - бежим
                    if (moveable.run(hurdle, moveable.getName(), moveable.getRunLimit()) == -1) break; // Если не преодолел препятсвие - сошел с дистанции
                } else {
                    if (moveable.jump(hurdle, moveable.getName(), moveable.getJumpLimit()) == -1) break;
                }
            }
        }
    }
}