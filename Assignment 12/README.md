# Problem Description

Several design properties for a problem are presented below. Use these properties in order to write all the necessary classes and/or interfaces for a solution to the problem. Focus on class structure and interaction. You may implement your solution however you wish, but you will be graded on the appropriateness of your solution to the requirements. Note the use of capitalization and parentheses for clarification. You may use whatever constructors or additional methods you wish.

## Requirements

### Animals

- Define a structure that can represent `Animals`.
- Animals have two behaviors:
  - `speak()`
  - `move()`
- Default behaviors:
  - When an animal moves, display the text: **"This animal moves forward"**.
  - When an animal speaks, display the text: **"This animal speaks"**.
- A general `Animal` should not be instantiable.

### Specific Classes

#### Goose

- Behaviors:
  - Where "animal" is displayed in `speak()` or `move()`, replace it with **"goose"**.
  - Goose can also `fly()`.

#### Lynx

- Behaviors:
  - Where "animal" is displayed in `speak()` or `move()`, replace it with **"lynx"**.

### Flying Objects

- Any instance of `Goose` can `fly()`, as can any `Flying` object.
- Define a class `Airplane` that is a `Flying` object.
- Specific behaviors for `fly()` in each class are up to you.

### Storage and Type Handling

- Instances of `Goose` or `Airplane` should be storable in a variable of type `Flying`.

---

## Solution Implementation

```java
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
```

## Output

```plaintext
This goose speaks
This goose moves forward
The goose is flying gracefully
This lynx speaks
This lynx moves forward
The airplane is flying through the skies
The goose is flying gracefully
The airplane is flying through the skies
```