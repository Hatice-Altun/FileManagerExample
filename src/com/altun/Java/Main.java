package com.altun.Java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Step 1: Determine content
        String scores = "Player A: 3, Player B: 6";

        // Step 2: Create file
        File scoreFiles = new File("C:\\git\\scores.txt");
        FileWriter fileWriter = new FileWriter(scoreFiles);

        // Step 3: Write content to file
        fileWriter.write(scores);
        fileWriter.close();
    }
}
