package OOPsFile;

public class Exp1 {
    public static void printPrimes(int limit) {
        System.out.println("Prime numbers up to " + limit + " are:");
        for (int num = 2; num <= limit; num++){
            boolean isPrime = true;
            for (int divisor = 2; divisor <= num / 2; divisor++){
                if (num % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args){
        int number = 47;
        printPrimes(number);
    }
}
