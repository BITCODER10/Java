package com.logicalnil;

import java.nio.file.Path;
import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String audioFilePath = "src/main/resources/ChildinUs.wav";
        Path filePath = Path.of(audioFilePath);
        MusicPlayer musicPlayer = new MusicPlayer(filePath);
        musicPlayer.inputSteam();

  }
}