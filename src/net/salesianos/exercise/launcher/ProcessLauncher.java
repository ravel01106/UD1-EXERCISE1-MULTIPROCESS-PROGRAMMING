package net.salesianos.exercise.launcher;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
/**
 * ProcessLauncher
 */
public class ProcessLauncher {
    public static final String OUTPUT_ROUTE = "./src/net/salesianos/exercise/outputs/";
    public static final String OUTPUT_FILE_NAME = "fichero.txt";
    public static final String PROGRAM_ROUTE = "./src/net/salesianos/exercise/processes/CharacterCounter.java";
    public static Process initProcess(String vocal){
        ProcessBuilder processBuilder = new ProcessBuilder(
            "java", PROGRAM_ROUTE, vocal
        );
        Process javaProcess = null;
        try {
            File outputFile = new File(OUTPUT_ROUTE + OUTPUT_FILE_NAME);
            processBuilder.redirectOutput(Redirect.appendTo(outputFile));
            javaProcess = processBuilder.start();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return javaProcess;
    }

}