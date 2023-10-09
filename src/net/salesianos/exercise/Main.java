package net.salesianos.exercise;


import java.io.File;
import java.util.ArrayList;


import net.salesianos.exercise.launcher.ProcessLauncher;
import net.salesianos.exercise.utils.Utils;

public class Main {
    public static void main(String[] args) {
        File outputFile = new File(ProcessLauncher.OUTPUT_ROUTE + ProcessLauncher.OUTPUT_FILE_NAME);
        if(outputFile.exists()){
            outputFile.delete();
        }
        String[] VOWELS = {"a", "e", "i", "o", "u"};
        ArrayList<Process> allProcess = new ArrayList<>();
        for (String vowel : VOWELS) {
            Process subprocess = ProcessLauncher.initProcess(vowel);
            allProcess.add(subprocess);
        }
        for (Process process : allProcess) {
            try {
                process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("El texto es el siguiente:\n" + Utils.getText() + "\n");
        Utils.printVocals(outputFile, VOWELS);

    }
}
