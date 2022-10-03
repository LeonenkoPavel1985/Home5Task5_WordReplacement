package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        String pathFile;
        System.out.println("Enter file path or file name:");
        pathFile = scanner.next();

        String wordSearch;
        System.out.println("Enter a search term:");
        wordSearch = scanner.next();

        String wordReplacement;
        System.out.println("Enter a replacement word:");
        wordReplacement = scanner.next();

        scanner.close();

        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(pathFile);

        Files.write(path,
                new String(Files.readAllBytes(path), charset).replace(wordSearch,wordReplacement).getBytes(charset));
        System.out.println("Replacement completed.");
    }
}