package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery first = new Lottery();
        System.out.println(first.getRandomBall());
        Lottery second = new Lottery();
        System.out.println(second.getRandomBall());
        Lottery third = new Lottery();
        System.out.println(third.getRandomBall());
    }
}
