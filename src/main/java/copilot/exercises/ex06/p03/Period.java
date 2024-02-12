package copilot.exercises.ex06.p03;

public class Period {
    //開始日と終了日をフィールドで持ちます
    //ここからコードを書いてください
    private String start;
    private String end;
    //自分自身が持つ期間と引数で受け取った期間が重なっているかどうかを判定するメソッドisOverlapped()を持ちます
    //ここからコードを書いてください
    public boolean isOverlapped(Period period) {
        if (this.start.compareTo(period.end) < 0 && this.end.compareTo(period.start) > 0) {
            return true;
        } else {
            return false;
        }
    }
    


}
