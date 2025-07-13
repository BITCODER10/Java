package com.logicalnil;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MusicPlayer {
    private final Path path;
    private final File audiofile;
    MusicPlayer(Path path){
        this.path = path;
        this.audiofile = new File(this.path.toUri());
    }

    void inputSteam(){
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audiofile);Scanner scanner = new Scanner(System.in)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            String response="";

            while (!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("F = Fast Forward");
                System.out.println("B = Fast Backwards ");

                System.out.println("Q = Quit");
                System.out.print("Enter Your Choice : ");
                response = scanner.next().toUpperCase();
                switch (response){
                    case "P"-> clip.start();
                    case "S"-> clip.stop();
                    case "R"-> clip.setMicrosecondPosition(0);
                    case "Q"-> clip.close();
                    case "F"-> {
                        long currentPosition = clip.getMicrosecondPosition();
                        clip.setMicrosecondPosition(currentPosition + 10_000_000);
                    }
                    case "B"-> {
                        long currentPosition = clip.getMicrosecondPosition();
                        if(currentPosition > 10_000_000){
                            clip.setMicrosecondPosition(currentPosition - 10_000_000);
                        }else {
                            clip.setMicrosecondPosition(0);
                        }
                    }

                    default -> System.out.println("Invalid Choice");
                }
            }



        }catch (FileNotFoundException f){
            System.out.println("File not found ");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access the audio resource");
            throw new RuntimeException(e);
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported ");
            throw new RuntimeException(e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
            throw new RuntimeException(e);
        }finally {

            System.out.println("Bye");
        }
    }

    public File getAudiofile() {
        return audiofile;
    }

    public Path getPath() {
        return path;
    }

}
