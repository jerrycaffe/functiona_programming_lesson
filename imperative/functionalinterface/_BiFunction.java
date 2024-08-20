package imperative.functionalinterface;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiplyByNum(2, 100)); //gives 300
        System.out.println(incrementBy1AndMultplyByNum.apply(2, 100)); //This gives the same result
    }

    //Normal methods
    static int incrementByOneAndMultiplyByNum(int numToAdd, int numToMultiply) {
        return (numToAdd + 1) * numToMultiply;
    }

    //BiFUnction takes two arguments

    static BiFunction<Integer, Integer, Integer> incrementBy1AndMultplyByNum = (numToAdd, numToMultiply) -> (numToAdd + 1) * numToMultiply;


}

