package net.salesianos.exercise.utils;

public class Utils {
    
    public static Integer countCharacterByLine(String line, String character){
        String characterLine = "";
        Integer counter = 0;
        for (int i = 0; i < line.length(); i++) {
            characterLine = String.valueOf(line.charAt(i)).toLowerCase();
            if (characterLine.equals(character)){
                counter++;
            }
        }
        System.out.println("->" + counter);
        return counter;
    }
}
