package test.oops;

public class Abstraction {

    public static void main(String[] args) {
        TV remote = new TvRemote();

        remote.turnOn();
        remote.turnOff();


        TV remote1 = new PlayRemote();

        remote1.turnOn();
        remote1.turnOff();

    }

}


abstract class TV{
    abstract void turnOn();

    abstract void turnOff();
}

class TvRemote extends TV {
    @Override
    void turnOn() {
        System.out.println("Tv is On");
    }

    @Override
    void turnOff() {
        System.out.println("Tv is off");
    }
}


class PlayRemote extends TV {
    @Override
    void turnOn() {
        System.out.println("Game is Started");
    }

    @Override
    void turnOff() {
        System.out.println("Game is Over");
    }
}

