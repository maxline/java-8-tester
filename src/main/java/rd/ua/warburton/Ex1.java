package rd.ua.warburton;

import java.util.function.BinaryOperator;

public class Ex1 {
    public static void main(String args[]) {

        Runnable noArguments = () -> System.out.println("Hello World");

        noArguments.run();

        BinaryOperator<Long> add = (x, y) -> x + y;

        System.out.println(add.apply(4L,5L));
    }

}
