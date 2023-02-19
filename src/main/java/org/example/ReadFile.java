package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadFile extends Results{

    HashMap <Integer, String> columnValue = new HashMap<>();
    public List search(String str) throws IOException {

        List<Results> saveLines = new ArrayList<Results>();
        int c = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader("airports.csv"));
        String saveLine;
        String[] parts;
        while ((saveLine = bufferedReader.readLine()) != null) {
            if (saveLine.contains(str)){
                parts = saveLine.split(",");
                for(int i=0; i < parts.length; i++){
                    if (parts[i].contains(str)){
                        Results result;
                        saveLines.add(result = new Results(i+1, saveLine,parts[i]));
                    }
                }
            }

        }
        bufferedReader.close();
        return saveLines;
    }
}
