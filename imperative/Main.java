package imperative;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", GENDER.MALE),
                new Person("Tope", GENDER.FEMALE),
                new Person("Maria", GENDER.FEMALE),
                new Person("Lia", GENDER.FEMALE),
                new Person("Jerry", GENDER.MALE)
        );

//        Imperative approach to print only female
        for (Person person : people) {
            if (person.gender.equals(GENDER.FEMALE)) System.out.println(person);
        }
//        Declarative Approach - use stream with collections
        Predicate<Person> personPredicate = person -> person.gender.equals(GENDER.FEMALE);
      List<Person> female =  people.stream().filter(personPredicate).toList();
        System.out.println(female);
    }

    static class Person {
        private final String name;
        private final GENDER gender;

        public Person(String name, GENDER gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum GENDER {
        MALE, FEMALE
    }
}