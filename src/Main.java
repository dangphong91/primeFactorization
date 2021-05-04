public class Main {
    public static void main(String[] args) {
        Thread num1 = new LazyPrimeFactorization(15, "A");
        Thread num2 = new OptimizedPrimeFactorization(15, "B");
        num1.start();
        num2.start();
    }
}
