package copilot.exercises.ex06.p03;

public class Main {
    //mainメソッドからisOverlappedメソッドを呼び出し、以下の期間が重なっているかどうかを判定してください
    public static void main(String[] args) {
        Period period1 = new Period();
        Period period2 = new Period();
        System.out.println(period1.isOverlapped(period2));
    }

}
