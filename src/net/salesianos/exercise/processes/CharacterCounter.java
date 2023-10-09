package net.salesianos.exercise.processes;

public class CharacterCounter {
    public static void main(String[] args) {
        String character = args[0].toLowerCase();
        String text = args[1];
        String characterLine = "";
        Integer counter = 0;
        for (int i = 0; i < text.length(); i++) {
            characterLine = String.valueOf(text.charAt(i));
            if (characterLine.equals(character)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
