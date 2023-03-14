package hw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("vasya", 1, 28));
        users.add(new User("oleg", 2, 22));
        users.add(new User("ostap", 3, 23));
        users.add(new User("roman", 4, 26));
        users.add(new User("ivan", 5, 25));

        users.sort((o1, o2) -> o1.getAge()- o2.getAge());
        users.sort((o1, o2) -> o2.getAge()- o1.getAge());
//        System.out.println(users);



        ArrayList<String> strings = new ArrayList<>();
        strings.add("bbbbb");
        strings.add("aaaa");
        strings.add("cccc");
        strings.add("gggg");
        strings.add("xxxxx");
        strings.add("lllll");
        strings.add("pppppp");
        strings.add("oooooo");
        strings.add("gggggg");
        strings.add("rrrrr");

        strings.sort((o1, o2) -> o1.compareTo(o2));
//        System.out.println(strings);


    }
}
