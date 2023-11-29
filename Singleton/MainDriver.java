public class MainDriver {
    public static void main(String[] args) {
        LazyInitializedSingleton one = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton two = LazyInitializedSingleton.getInstance();

        System.out.println(one);
        System.out.println(two);

        one.doWork();

        System.out.println(one);
        System.out.println(two);
    }
}
