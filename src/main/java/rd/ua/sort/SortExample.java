package rd.ua.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        System.out.println(ex1(names));

        names.forEach(System.out::println);
    }

    private static List<String> ex1(List names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        return names;
    }

    //lambda
    private static List<String>  ex2(List<String> names) {
        Collections.sort(names, (o1, o2) -> o1.compareTo(o2));
        return names;
    }

    // method reference
    private static List<String>  ex3(List<String> names) {
        Collections.sort(names, String::compareTo);
        return names;
    }

    // method reference
    private static List<String>  ex4(List<String> names) {
        names.sort(String::compareTo);
        return names;
    }

    // comparator natural or
    private static List<String>  ex5(List<String> names) {
        names.sort(Comparator.naturalOrder());
        return names;
    }
}
