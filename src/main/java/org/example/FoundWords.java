package org.example;

public class FoundWords {
    private int position;
    private String value;

    FoundWords(){
        position = 0;
        value = " ";
    }
    FoundWords(int position, String value){
        this.position = position;
        this.value = value;
    }
    public void setPosition(int position){
        this.position = position;
    }

    public void setValue(String value){
        this.value = value;
    }

    public int getPosition(){
        return this.position;
    }

    public String getValue(){
        return this.value;
    }



}
