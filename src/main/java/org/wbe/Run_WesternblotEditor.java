package org.wbe;

import java.io.File;
import java.io.IOException;


public class Run_WesternblotEditor {

    public static void main(String[] args){
        File file1 = new File("../src/main/resources/bash_scripts/refresh_output.sh");
        file1.setExecutable(true);
        try {

            ProcessBuilder pb = new ProcessBuilder("../src/main/resources/bash_scripts/refresh_output.sh");
            Process p = pb.start();
            p.waitFor();

            System.out.println("Script executed successfully");

        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        try{

            new UMGCWesternBlotEditor();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
