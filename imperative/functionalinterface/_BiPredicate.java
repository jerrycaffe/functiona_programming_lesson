package imperative.functionalinterface;

import java.util.function.BiPredicate;

public class _BiPredicate {
    public static void main(String[] args) {

//Chain multiple conditions
       boolean starting7AndelevenInLength = isStartsWIth07.or(isElevenInLengthANdContainsValue).test("0909", "2");
        System.out.println("Is any of the conditions obeyed? "+starting7AndelevenInLength);
//        System.out.println("Is all of the conditions obeyed? "+mustValidate);

    }

//    Chaining Predicate - Functional programming style
//    It takes just two arguments and return a bollean
    static BiPredicate<String, String> isStartsWIth07 = (phoneNumber, value) -> phoneNumber.startsWith("07");
    static BiPredicate<String, String> isElevenInLengthANdContainsValue = (phoneNumber, value) -> phoneNumber.length() == 11 && phoneNumber.contains(value);

}
