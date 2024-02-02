package copilot.exercises.ex03.p02;

public class Ex02 {
    public static void main(String[] args) {
        
    }
    static void isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }

}
