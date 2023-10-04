package net.salesianos.exercise.processes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCounter {
    public static void main(String[] args) {
        String character = args[0].toLowerCase();
        String route = "./src/net/salesianos/exercise/input/prueba.txt";
        try {
            BufferedReader bf = new BufferedReader( new FileReader(route));
            String line = bf.readLine();
            int counter = 0;
            while (line != null) {
                String characterLine = "";
                for (int i = 0; i < line.length(); i++) {
                    characterLine = String.valueOf(line.charAt(i)).toLowerCase();
                    if (characterLine.equals(character)){
                        counter++;
                    }
                }
                line = bf.readLine();
            }
            System.out.println(counter);
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
