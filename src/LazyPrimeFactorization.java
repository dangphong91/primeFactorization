public class LazyPrimeFactorization extends Thread {
    int number;
    String name;
    LazyPrimeFactorization(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public void run() {
        boolean test = true;
        int N = 2;
        for (int i = 0; i < number;) {
            for (int j = 2; j < N-1; j++) {
                if (N%j == 0) {
                    test = false;
                    break;
                }
            }
            if (test) {
                System.out.println(this.name+ ": " + N);
                i++;
            }
            N++;
            test = true;
        }
    }
}
