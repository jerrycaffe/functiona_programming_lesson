package imperative.combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Jerry", "jerrycaffe@gmail.com", "8088492993", LocalDate.of(2000, 1, 1)
        );
//  Using combinator pattern

        var result = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAnAdult()).apply(customer);
        System.out.println(result);
        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS) throw new IllegalStateException("Error validating user");
    }
}
