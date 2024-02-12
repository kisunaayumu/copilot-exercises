package copilot.exercises.ex06.p02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //①LocalDateクラスを使って、今日の日付を「例）2023年12月31日」のフォーマットで出力してください
        //②徳仁天皇の誕生日は、1960年2月23日です。徳仁天皇が生まれてから、今日で何年何ヶ月何日経過したかを出力してください
        //ここからコードを書いてください
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(date.format(formatter));
        LocalDate birthday = LocalDate.of(1960, 2, 23);
        System.out.println(birthday.until(date).getYears() + "年" + birthday.until(date).getMonths() + "ヶ月" + birthday.until(date).getDays() + "日");
        
        
    }

}
