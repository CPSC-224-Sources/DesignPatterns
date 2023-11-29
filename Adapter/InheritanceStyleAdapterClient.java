// Legacy Rectangle class
class LegacyRectangle {
    private int length;
    private int width;

    public LegacyRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}

// Target interface expected by the new system
interface Shape {
    int computeArea();
}

// Adapter class to make LegacyRectangle compatible with the Shape interface
class RectangleAdapter implements Shape {
    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public int computeArea() {
        // Call the legacy method and adapt the result
        return legacyRectangle.calculateArea();
    }
}

// Client code using the new system
class InheritanceStyleAdapterClient {
    public static void main(String[] args) {
        // Using the LegacyRectangle through the adapter
        LegacyRectangle legacyRectangle = new LegacyRectangle(5, 10);
        Shape shapeAdapter = new RectangleAdapter(legacyRectangle);

        // Now, the legacy rectangle is used as a Shape
        System.out.println("Area: " + shapeAdapter.computeArea());
    }
}

