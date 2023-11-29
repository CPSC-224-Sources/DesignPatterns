// Bird class
class Bird {
    private String name;
    private double wingspan;

    public Bird(String name, double wingspan) {
        this.name = name;
        this.wingspan = wingspan;
    }

    public String getName() {
        return name;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public String toString() {
        return "Bird: " + name + ", Wingspan: " + wingspan + " meters";
    }
}

// Concrete Bird types
class Eagle extends Bird {
    public Eagle(String name) {
        super(name, 2.0);
    }
}

class Sparrow extends Bird {
    public Sparrow(String name) {
        super(name, 0.2);
    }
}

class Penguin extends Bird {
    public Penguin(String name) {
        super(name, 1.0);
    }
}

// Bird Factory class
class BirdFactory {
    public static Bird createBird(String type) {
        switch (type.toLowerCase()) {
            case "eagle":
                return new Eagle("Bald Eagle");
            case "sparrow":
                return new Sparrow("House Sparrow");
            case "penguin":
                return new Penguin("Emperor Penguin");
            default:
                throw new IllegalArgumentException("Invalid bird type: " + type);
        }
    }
}

// Example usage
public class MainFactory {
    public static void main(String[] args) {
        Bird eagle = BirdFactory.createBird("eagle");
        Bird sparrow = BirdFactory.createBird("sparrow");
        Bird penguin = BirdFactory.createBird("penguin");

        System.out.println(eagle);
        System.out.println(sparrow);
        System.out.println(penguin);
    }
}
