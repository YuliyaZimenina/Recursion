public class RecursionDemo {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Calculating factorials using a recursive method");
        System.out.println("Factorial 3 = " + f.factorialRecursive(3));
        System.out.println("Factorial 4 = " + f.factorialRecursive(4));
        System.out.println("Factorial 5 = " + f.factorialRecursive(5));
        System.out.println();

        System.out.println("Calculating factorials using an iterative method");
        System.out.println("Factorial 3 = " + f.factorialIterative(3));
        System.out.println("Factorial 4 = " + f.factorialIterative(4));
        System.out.println("Factorial 5 = " + f.factorialIterative(5));
    }
}
