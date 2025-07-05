package com.logicalnil;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.Scanner;

public class questionsList {
    private MyData[] data;
    int correctCount =0;
    public questionsList() throws FileNotFoundException {
        Gson gson = new Gson();
        Path path = Path.of(".//src//main//resources//questions.json");
        System.out.println("Path is : "+path.toString());
        File file = new File(path.toUri());
        System.out.println("File URI is : " + file.toString());
        FileReader reader = new FileReader(file);
        System.out.println("Reader is : " + reader.toString());
        this.data = gson.fromJson(reader, MyData[].class);
    }

    public MyData[] getData() {
        return data;
    }

    public void BeginGame(){
        Scanner scanner = new Scanner(System.in);
loop:
        for (MyData Q : data) {
            System.out.println("Question : "+Q.question);
            System.out.println();
            System.out.println("Option A :"+ Q.A);
            System.out.println("Option B :"+ Q.B);
            System.out.println("Option C :"+ Q.C);
            System.out.println("Option D :"+ Q.D);
            System.out.println();
            System.out.print("Enter your Answer :");
            String ans = scanner.next().trim();
            if(Q.answer.equals(ans)){
                System.out.println("\nCorrect Answer");
                correctCount ++;
                System.out.println("Current Score : "+ correctCount + " / " + data.length);

            }else {
                System.out.println("Incorrect Answer ");
            }
            System.out.println("Continue Game ? (Y / N)");
            String input = scanner.next().toLowerCase();
            if (input.equals("y")){
                System.out.println("Continuing Game .....");
            }else {
                break loop;
            }

        }
        scanner.close();
    }
}