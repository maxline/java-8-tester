package rd.ua;

import java.util.List;
import java.util.ArrayList;


public class MethodReferenceExample {

    public static void main(String args[]) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        //names.forEach(names.get(0).);
        names.forEach(System.out::println);
    }
}