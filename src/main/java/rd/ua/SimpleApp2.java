package rd.ua;

public class SimpleApp2 {

    public static void main(String args[]) {
        System.out.println("10 - 4 = " + operate((int a, int b) -> a - b));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private static int operate(MathOperation mathOperation) {
        return mathOperation.operation(10, 4);
    }
}