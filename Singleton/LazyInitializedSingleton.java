public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private Integer currentCount = 0;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public void doWork() {
        currentCount++;
    }

    @Override
    public String toString() {
        return "Current Count: " + this.currentCount;
    }
}