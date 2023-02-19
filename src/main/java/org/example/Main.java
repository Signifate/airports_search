package org.example;
import java.io.IOException;
import java.util.Scanner;



public class Main extends ReadFile{
    public static void main(String[] args) throws IOException {
        Scanner user = new Scanner(System.in);
        String str; //введенная строка
        int column; //введенная колнка
        String info = "";
        while ( info != "!quit"){
            info = user.nextLine(); //считывание столбца

            column = Integer.parseInt(info);
            System.out.println("Введите строку: ");
            str = user.nextLine();
            
            long startTime = System.nanoTime(); //начало отсчета времени поиска
            ReadFile read = new ReadFile();
            Results.print(read.search(str), column);

            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.printf("%d мс%n",duration/1000000);
        }
    }
}
