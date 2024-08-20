package imperative.optional;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class _Optional {
    public static void main(String[] args) {
        Consumer<Object> emailAdress = email -> System.out.println("Sending email to the email address " + email);

        Optional.of("jerrycaffe@gmail.com")
                .ifPresentOrElse(
                        emailAdress,
                        () -> System.out.println("Cannot send email as email is not present"));

    }
}
