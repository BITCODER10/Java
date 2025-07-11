package com.logicalnil;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class SimpleFileWriter implements AutoCloseable {
    private final String filePath="/Users/*****/Desktop/JAVA/Again/src/main/java/com/logicalnil/test.txt";
    private Path p;
    SimpleFileWriter(){

    }

    public String getFilePath() {
        return filePath;
    }


    void readFile(){

        try (FileWriter Writer = new FileWriter(filePath)){
            System.out.println("Path is set to : "+ filePath);
            Writer.write("\nThis is the beginning of the File");
            Writer.append("""
                    \n1. Harry Potter
                    2. Lord of the Rings,\s
                    3. Game of Thrones
                   \s""");
            Writer.append("This is the end of file");
            Writer.write("\nWill this create a new line ");
            Writer.getEncoding();
        }catch (FileNotFoundException e){
            System.out.println("File path now found");
        }catch (IOException e){
            System.out.println("IO exceptions");
        }catch (Exception e){
            System.out.println("Something is wrong ");
        }
        finally {
            System.out.println("Code Executed");
        }


    }

    @Override
    public void close() throws Exception {

    }
}
