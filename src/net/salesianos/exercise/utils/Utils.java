package net.salesianos.exercise.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import net.salesianos.exercise.launcher.ProcessLauncher;

public class Utils {
    
    public static String getText(){
        String INPUT_ROUTE = "./src/net/salesianos/exercise/input/lorem_ipsum.txt";
        String text = "";
        try {
            BufferedReader inputFileReader = new BufferedReader(new FileReader(INPUT_ROUTE));
            String line = inputFileReader.readLine();
            while(line != null){
                text += line.toLowerCase();
                line = inputFileReader.readLine();
            }
            inputFileReader.close();
            return text;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void printText(){
        System.out.println("El texto es el siguiente:\n" + getText() + "\n");
    }

    public static void printVocals(File outputFile, String[] vowels){
        try {
            BufferedReader outputFileReader = new BufferedReader(new FileReader(outputFile));
            String line = outputFileReader.readLine();
            int totalVowels = 0;
            for (String vowel : vowels) {
                if(line != null){
                    System.out.println("El texto tiene " + line + " vocales " + vowel + ".");
                    totalVowels += convertStringToNumeric(line);
                    line = outputFileReader.readLine();
                }
            }
            System.out.println("Y el total de vocales es " + totalVowels + ".");

            outputFileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Integer convertStringToNumeric(String line){
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    public static void removeOutputFile(File outputFile) {
        if(outputFile.exists()){
            outputFile.delete();
        }
    }
}
