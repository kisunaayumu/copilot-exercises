package copilot.exercises.ex02.p03;

public class Ex03 {
    public static void main(String[] args) {
        //forループを使用して、以下のようなピラミッドを出力してください

//実行結果
//   *
 // ***
// *****
//********
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
