package net.salesianos.exercise.launcher;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import net.salesianos.exercise.utils.Utils;
/**
 * ProcessLauncher
 */
public class ProcessLauncher {
    public static final String OUTPUT_ROUTE = "./src/net/salesianos/exercise/outputs/";
    public static final String OUTPUT_FILE_NAME = "fichero.txt";
    public static final String PROGRAM_ROUTE = "./src/net/salesianos/exercise/processes/CharacterCounter.java";
    public static final String INPUT_TEXT = Utils.getText();
    public static Process initProcess(String vocal){
        ProcessBuilder processBuilder = new ProcessBuilder(
            "java", PROGRAM_ROUTE, vocal, INPUT_TEXT
        );
        Process javaProcess = null;
        try {
            //File outputFile = new File(OUTPUT_ROUTE + OUTPUT_FILE_NAME + "_" + vocal + ".txt");
            
            File outputFile = new File(OUTPUT_ROUTE + OUTPUT_FILE_NAME);
            processBuilder.redirectOutput(Redirect.appendTo(outputFile));
            javaProcess = processBuilder.start();
            return javaProcess;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}