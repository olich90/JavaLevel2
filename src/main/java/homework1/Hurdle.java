package homework1;

public class Hurdle {    // Класс Препятствие
    protected int value; // Величина препятствия (для дорожки - длина, для стены - высота)

    public Hurdle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}