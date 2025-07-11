package com.logicalnil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class SimpleFileReader implements AutoCloseable {
    Path filePath;
    BufferedReader bufferedReader=null;
    SimpleFileReader(Path filePath) throws FileNotFoundException {
        this.filePath = filePath;
    }


    void readFile() throws IOException {
        String s;
        try(FileReader fileReader = new FileReader(filePath.toFile())) {
            bufferedReader = new BufferedReader(fileReader);
            while ((s = bufferedReader.readLine()) !=null){
                System.out.println(s);
            }
        }catch (Exception e){
            System.out.println("Something went wrong");
        }


    }
    @Override
    public void close() throws Exception {

    }
}
