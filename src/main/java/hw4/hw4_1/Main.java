package hw4.hw4_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        HashSet<User> userHashSet = new HashSet<>();
        userHashSet.add(new User(1,"vasya", "pupkin","afafafa@gmail.com",23,Gender.MALE, List.of(new Skill("java", 10)),
                new Car("lada",2000, 100)));
        userHashSet.add(new User(2,"oleg", "rara","afafafa@gmail.com",23,Gender.MALE, List.of(new Skill("react", 10)),
                new Car("audi",2002, 150)));
        userHashSet.add(new User(3,"sofia", "lalala","afafafa@gmail.com",23,Gender.FEMALE, List.of(new Skill("js", 10)),
                new Car("skoda",2003, 200)));
        userHashSet.add(new User(4,"olena", "gagaga","afafafa@gmail.com",23,Gender.FEMALE, List.of(new Skill("css", 10)),
                new Car("bmw",2005, 200)));
        userHashSet.removeIf(user -> user.getGender().equals(Gender.MALE));
        System.out.println(userHashSet);

        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(new User(1,"vasya", "pupkin","afafafa@gmail.com",23,Gender.MALE, List.of(new Skill("java", 10)),
                new Car("lada",2000, 100)));
        userTreeSet.add(new User(2,"oleg", "rara","afafafa@gmail.com",23,Gender.MALE, List.of(new Skill("react", 9)),
                new Car("audi",2002, 150)));
        userTreeSet.add(new User(3,"sofia", "lalala","afafafa@gmail.com",23,Gender.FEMALE, List.of(new Skill("js", 5)),
                new Car("skoda",2003, 200)));
        userTreeSet.add(new User(4,"olena", "gagaga","afafafa@gmail.com",23,Gender.FEMALE, List.of(new Skill("css", 10)),
                new Car("bmw",2005, 200)));

        System.out.println(userTreeSet);


    }
}
