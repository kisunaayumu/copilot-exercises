package main.java.copilot.exercises.ex07.p01;

import java.util.ArrayList;

public class Cooking {
    public Cooking(String name, int price) {
        System.out.println("料理名：" + name + " 価格：" + price + "円");

    }

    public static void main(String[] args) {
        //ArrayList\<Cooking>を使用して料理を管理してください
        ArrayList<Cooking> cookingList = new ArrayList<>();
        cookingList.add(new Cooking("ステーキ", 2500));
        cookingList.add(new Cooking("サラダ", 800));
        cookingList.add(new Cooking("パスタ", 1200));
        
        }

    private void setPrice(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'setPrice'");
    }
    }

