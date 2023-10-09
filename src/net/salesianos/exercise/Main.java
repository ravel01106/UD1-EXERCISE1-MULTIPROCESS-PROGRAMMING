package net.salesianos.exercise;


import java.io.File;
import java.util.ArrayList;


import net.salesianos.exercise.launcher.ProcessLauncher;
import net.salesianos.exercise.utils.Utils;

public class Main {
    public static void main(String[] args) {
        File outputFile = ProcessLauncher.OUTPUT_FILE;
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

        Utils.printText();
        Utils.printVocals(outputFile, VOWELS);
        Utils.removeOutputFile(outputFile);

    }
}
