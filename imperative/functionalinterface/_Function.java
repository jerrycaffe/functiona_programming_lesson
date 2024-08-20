package imperative.functionalinterface;

import java.util.function.Function;

public class _Function {

        public static void main(String[] args) {
            System.out.println(increment(3)); // produces 3 + 1 which is 4
            //Using the function needs the call to apply method
            System.out.println(incrementByOne.apply(3)); // This as well produces 4 as 3 + 1 will result to this
        }

        //Using Functional programming
    //A Function takes one arguments and return the result of the operations
        static Function<Integer, Integer> incrementByOne = number -> number + 1;

        //Normal function

        static int increment(int number){
            return number + 1;
        }

}
