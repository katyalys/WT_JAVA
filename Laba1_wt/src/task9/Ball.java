package task9;

public class Ball {
    public Ball(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getColor() {
        return this.color;
    }

    private final int weight;
    private final String color;
}