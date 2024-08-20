package imperative.functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Jerry", "08088492993"));
//The accept keyword is used to trigger the consumer function
        greetCustomerConsume.accept(new Customer("Jerry", "08088492993"));
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
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " Thank you for registering phone number " + customer.customerPhoneNumber);
    }

    //  Consumer -  Functional interface
//    Consumer Takes one argument and return no value
    static Consumer<Customer> greetCustomerConsume = customer -> System.out.println("Hello " + customer.customerName + " Thank you for registering phone number " + customer.customerPhoneNumber);
}
