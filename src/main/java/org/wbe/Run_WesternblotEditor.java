package org.wbe;

import java.io.File;
import java.io.IOException;


public class Run_WesternblotEditor {

    public static void main(String[] args){
        /*File file1 = new File("./refresh_output.sh");
        file1.setExecutable(true);

        //File dependency_checker = new File("../src/main/resources/bash_scripts/dependency_check.sh");

        try {
            ProcessBuilder pb = new ProcessBuilder("./refresh_output.sh");
            Process p = pb.start();
            p.waitFor();
            System.out.println("Script executed successfully");

            ProcessBuilder pb2 = new ProcessBuilder("../src/main/resources/bash_scripts/dependency_check.sh");
            Process p2 = pb2.start();
            p2.waitFor();
            System.out.println("Dependencies checked");


        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }*/
        try{

            new UMGCWesternBlotEditor();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
