package imperative.callbacks;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //In javascript we have the concept of callbacks when a particular function can take another function then run it
        greet("John", null, () -> {
            System.out.println("no Lastname provided");
        });
    }

    static void greet(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) System.out.println(lastName);
        else callback.accept(firstName);
    }

    static void greet(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) System.out.println(lastName);
        else callback.run();
    }
}
