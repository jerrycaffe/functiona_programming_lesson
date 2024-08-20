package imperative.functionalinterface;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Jerry", "08088492993"), false);
//Accept as well is used just like in Consumer as well
        greetCustomerConsume.accept(new Customer("Jerry", "08088492993"), false);
    }

    //Creating the structure to be consumed
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

    //Normal method call
    static void greetCustomer(Customer customer, Boolean showPhone) {
        System.out.println("Hello " + customer.customerName + " Thank you for registering phone number " + (showPhone ? customer.customerPhoneNumber : "**********"));
    }

    //  BiConsumer - Takes Two arguments and then return no value Functional interface
    static BiConsumer<Customer, Boolean> greetCustomerConsume =
            (customer, showPhoneNumber)
                    -> System.out.println("Hello " + customer.customerName + " Thank you for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));
}
