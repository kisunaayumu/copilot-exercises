package copilot.exercises.ex06.p01;

public class Main {
    public static void main(String[] args) {
        //ここで回文チェックを行う文字列を指定してください
        String word = "level";
        palindromeChecker(word);
        
    }
    public static void palindromeChecker(String word){
        //文字列が回文であればtrueを、そうでなければfalseを返すコード
        //ここからコードを書いてください
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
