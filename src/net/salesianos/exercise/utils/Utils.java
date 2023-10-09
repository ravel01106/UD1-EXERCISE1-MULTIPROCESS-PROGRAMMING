package net.salesianos.exercise.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    
    public static String getText(){
        String route = "./src/net/salesianos/exercise/input/lorem_ipsum.txt";
        String text = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(route));
            String line = bf.readLine();
            while(line != null){
                text += line.toLowerCase();
                line = bf.readLine();
            }
            bf.close();
            return text;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void printVocals(File outputFile, String[] vocals){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(outputFile));
            String line = bf.readLine();
            int TotalVocals = 0;
            for (String vocal : vocals) {
                if(line != null){
                    System.out.println("El texto tiene " + line + " vocales " + vocal + ".");
                    TotalVocals += convertStringNumeric(line);
                    line = bf.readLine();
                }
            }
            System.out.println("Y el total de vocales es " + TotalVocals + ".");

            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Integer convertStringNumeric(String line){
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
