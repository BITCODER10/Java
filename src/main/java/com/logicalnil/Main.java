package com.logicalnil;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String path = "/Users/*****/Desktop/Delete/test.py";
        try (SimpleFileReader simpleFileReader = new SimpleFileReader(Path.of(path));){
            simpleFileReader.readFile();
        }catch (FileNotFoundException f){
            System.out.println("File not found ");
        }catch (Exception e){
            System.out.println("Something is wrong");
        }finally {

        }


  }
}