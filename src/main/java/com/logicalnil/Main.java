package com.logicalnil;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/words.txt");
        int RandomIndex, incorrectGuess=0, correctGuess;
        WordFileReader wordFileReader = new WordFileReader(path);
        ArrayList<Word> wordsCollection = wordFileReader.readFile();
        Random random = new Random();
        RandomIndex = random.nextInt(0, wordFileReader.getCollectionSize()+1);
        String RandomlyChosenWord = wordsCollection.get(RandomIndex).getWord().toLowerCase();
//        System.out.println("Final answer is supposed to be : "+RandomlyChosenWord);
        System.out.println();
        printGuessTheCountry();
        System.out.println();
        System.out.println();
        System.out.print("Chosen Word is :\t");
        System.out.print("[ ");

        for(int i = 0; i < RandomlyChosenWord.length(); i++){
                System.out.print("__"+" ");
        }
        System.out.print(" ]");

        System.out.println();

        LogicChecker logicChecker = new LogicChecker( RandomlyChosenWord);
        logicChecker.fillBCwith_();
looping:    while (LogicChecker.getIncorrectCount() !=6){
            logicChecker.setCh(getChar());
            if (logicChecker.ifWordExist()){
                System.out.println("Congratulations ! you got that right ");
                System.out.println("Your guess so far ..... \t\t"+Arrays.toString(LogicChecker.getBc()));
            }else{
                System.out.println("OOPS !");
                System.out.println("You wrong attempt number is :"+ (LogicChecker.getIncorrectCount()+1));
                AsciiHangman.getHangman(LogicChecker.getIncorrectCount());
                System.out.println(Arrays.toString(LogicChecker.getBc()));
                System.out.println("Following characters did not match till now : "+LogicChecker.getExhaustiveList().toString());
            }
            if(logicChecker.isBCFull()){
                System.out.println("Congratulations ! You got the full word");
                createSimpleMovingFlag();
                break looping;
            }
        }
        System.out.println("The correct country was : "+RandomlyChosenWord);


    scanner.close();
  }
  public static char getChar(){
      System.out.print("\nEnter the Character :");
      return scanner.next().charAt(0);
  }

    public static void createSimpleMovingFlag() {
        String[] frames = {
                "|********\\",
                "|********|",
                "|********/",
                "|********|"
        };

        try {
            for (int i = 0; i < 30; i++) {
                System.out.print("\t\t\r" + frames[i % frames.length]);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Stopped");
        }
    }

    public static void printGuessTheCountry() {
        System.out.println("  ██████  ██    ██ ███████ ███████ ███████     ████████ ██   ██ ███████ ");
        System.out.println(" ██       ██    ██ ██      ██      ██             ██    ██   ██ ██      ");
        System.out.println(" ██   ███ ██    ██ █████   ███████ ███████        ██    ███████ █████   ");
        System.out.println(" ██    ██ ██    ██ ██           ██      ██        ██    ██   ██ ██      ");
        System.out.println("  ██████   ██████  ███████ ███████ ███████        ██    ██   ██ ███████ ");
        System.out.println();
        System.out.println("  ██████  ██████  ██    ██ ███    ██ ████████ ██████  ██    ██ ");
        System.out.println(" ██      ██    ██ ██    ██ ████   ██    ██    ██   ██  ██  ██  ");
        System.out.println(" ██      ██    ██ ██    ██ ██ ██  ██    ██    ██████    ████   ");
        System.out.println(" ██      ██    ██ ██    ██ ██  ██ ██    ██    ██   ██    ██    ");
        System.out.println("  ██████  ██████   ██████  ██   ████    ██    ██   ██    ██    ");
    }
}