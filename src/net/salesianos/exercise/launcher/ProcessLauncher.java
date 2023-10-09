package net.salesianos.exercise.launcher;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import net.salesianos.exercise.utils.Utils;

public class ProcessLauncher {
    public static final String OUTPUT_ROUTE = "./src/net/salesianos/exercise/outputs/fichero.txt";
    public static final String PROGRAM_ROUTE = "./src/net/salesianos/exercise/processes/CharacterCounter.java";
    public static final String INPUT_TEXT = Utils.getText();
    public static final File OUTPUT_FILE = new File(OUTPUT_ROUTE);
    public static Process initProcess(String vocal){
        ProcessBuilder processBuilder = new ProcessBuilder(
            "java", PROGRAM_ROUTE, vocal, INPUT_TEXT
        );
        Process javaProcess = null;
        try {
            processBuilder.redirectOutput(Redirect.appendTo(OUTPUT_FILE));
            javaProcess = processBuilder.start();
            return javaProcess;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}