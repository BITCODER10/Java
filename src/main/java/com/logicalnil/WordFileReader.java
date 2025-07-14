package com.logicalnil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;

public class WordFileReader {
    private final Path path;
    private final int l=0;
    private final ArrayList<Word> wordsCollection = new ArrayList<>();


    WordFileReader(Path path){
        this.path = path;
    }
    ArrayList<Word> readFile(){
        try {
            String s;
            File file = new File(path.toUri());
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((s = bufferedReader.readLine()) != null){
                wordsCollection.add(new Word(s.trim()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return wordsCollection;
    }

    int getCollectionSize(){
        return wordsCollection.size();
    }
}
