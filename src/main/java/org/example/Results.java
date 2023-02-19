package org.example;

import java.util.List;

public class Results {
    private int column;
    private String fullString;
    private String subString;

    Results(){
        column = 0;
        fullString = "";
        subString = "";
    }
    Results(int column, String fullString, String subString){
        this.column = column;
        this.subString = subString;
        this.fullString = fullString;
    }

    int getColumn(){
        return this.column;
    }

    String getFullString(){
        return this.fullString;
    }
    String getSubString(){
        return this.subString;
    }

    void setColumn(int column){
        this.column = column;
    }
    void setFullString(String fullString){
        this.fullString = fullString;
    }

    void setSubString(String subString){
        this.subString = subString;
    }

    public static void print(List<Results> resultsList, int column){
        int c = 0;
        for (Results result: resultsList) {
            if (result.getColumn() == column){
                System.out.printf("%d %s[%s]%n", result.getColumn(), result.getSubString(), result.getFullString());
                c++;
            }
        }
        System.out.printf("%d строк %n",c);
    }
}
