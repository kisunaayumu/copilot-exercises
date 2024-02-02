package copilot.exercises.ex03.p01;

public class Ex01 {
    public static void main(String[] args) {
        
        System.out.println("10");
    }public void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}