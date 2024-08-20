package imperative.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

        public static void main(String[] args) {
            //Normal method
            System.out.println(isPhoneNumberValid("07047474402")); //returns true as it starts with 07 and the length is 11
            System.out.println(isPhoneNumberValid("07088888888888888888888"));
            System.out.println(isPhoneNumberValid("080484748473"));
//using functional
            //Notice the use of test method to invoke the predicate function
            System.out.println(isPhoneValidPred.test("07047474402"));//returns true as it starts with 07 and the length is 11
            System.out.println(isPhoneValidPred.test("07088888888888888888888"));
            System.out.println(isPhoneValidPred.test("080484748473"));
        }
        //Normal method
        static boolean isPhoneNumberValid(String phoneNumber){
            return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
        }

        //    Using Predicate - Functional programming style
//    Takes a single argument and return a boolean
        static Predicate<String> isPhoneValidPred = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

}
