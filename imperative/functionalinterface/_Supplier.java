package imperative.functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrl());
        System.out.println(getDbConnectionUrlSup.get());
    }
    //Normal method
    static String getDbConnectionUrl(){
        return "jdbc://localhost:5432";
    }
//    Using Supplier a Functional programming
    static Supplier<String> getDbConnectionUrlSup = ()-> "jdbc://localhost:5432";

}
