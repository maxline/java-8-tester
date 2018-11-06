package rd.ua.tutorialspoint;

public class SimpleApp3 {

    public static void main(String args[]) {
        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        System.out.println(addition.operation(7,9));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

}