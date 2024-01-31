package LearnCollection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Amit");
        names.add("Gudiya");
        names.add("Aadvik");

        System.out.println(names);


        boolean flag =  names.contains("Radha");
        System.out.println(flag);

        names.remove("Amit");
        System.out.println(names);
    }
}
