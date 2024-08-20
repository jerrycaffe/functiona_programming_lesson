package imperative.stream;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", GENDER.MALE),
                new Person("Tope", GENDER.FEMALE),
                new Person("Maria", GENDER.FEMALE),
                new Person("Lia", GENDER.FEMALE),
                new Person("Jerry", GENDER.MALE)
        );

//       Function Application
        Predicate<Person> genderPredicate = person -> person.gender.equals(GENDER.MALE);
        boolean allIsFemale = people.stream()
                .allMatch(genderPredicate);
        System.out.println(allIsFemale);
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
