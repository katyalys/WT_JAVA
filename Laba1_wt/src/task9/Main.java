package task9;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(34, "Blue"));
        basket.addBall(new Ball(15, "Red"));
        basket.addBall(new Ball(10, "Blue"));
        basket.addBall(new Ball(53, "Yellow"));
        basket.addBall(new Ball(28, "Blue"));

        AtomicInteger weightOfBalls = new AtomicInteger();
        AtomicInteger amountOfBlueBalls = new AtomicInteger();
        basket.getBallsList().forEach((Ball ball) -> {
            weightOfBalls.addAndGet(ball.getWeight());
            if (Objects.equals(ball.getColor(), "Blue")) {
                amountOfBlueBalls.getAndIncrement();
            }
        });
        System.out.println("The weight of all balls in the basket: " + weightOfBalls);
        System.out.println("The amount of blue balls in the basket: " + amountOfBlueBalls);
    }
}