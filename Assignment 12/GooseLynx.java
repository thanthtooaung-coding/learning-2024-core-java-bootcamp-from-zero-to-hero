abstract class Animal {
    public abstract void speak();
    public abstract void move();
}

class Goose extends Animal implements Flying {
    @Override
    public void speak() {
        System.out.println("This goose speaks");
    }

    @Override
    public void move() {
        System.out.println("This goose moves forward");
    }

    @Override
    public void fly() {
        System.out.println("The goose is flying gracefully");
    }
}

class Lynx extends Animal {
    @Override
    public void speak() {
        System.out.println("This lynx speaks");
    }

    @Override
    public void move() {
        System.out.println("This lynx moves forward");
    }
}

interface Flying {
    void fly();
}

class Airplane implements Flying {
    @Override
    public void fly() {
        System.out.println("The airplane is flying through the skies");
    }
}

public class GooseLynx {
    public static void main(String[] args) {
        Goose goose = new Goose();
        Lynx lynx = new Lynx();

        goose.speak();
        goose.move();
        goose.fly();

        lynx.speak();
        lynx.move();

        Airplane airplane = new Airplane();
        airplane.fly();

        Flying[] flyingObjects = {goose, airplane};

        for (Flying obj : flyingObjects) {
            obj.fly();
        }
    }
}