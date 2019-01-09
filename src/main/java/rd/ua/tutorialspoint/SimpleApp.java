package rd.ua.tutorialspoint;

public class SimpleApp {

    public static void main(String args[]) {
        SimpleApp tester = new SimpleApp();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("2 + 4 = " + addition.operation(2, 4));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}