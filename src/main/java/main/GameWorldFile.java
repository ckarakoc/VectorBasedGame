package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Lars on 07/02/2016.
 */
public class GameWorldFile {

    public String path;
    public File file;

    public GameWorldFile(String path){
        file = new File(path);
    }

    public GameWorldFile(URL path){
        file = new File(path.getPath());
    }

    public GameWorldFile(File file){
        this.file = file;
    }

    public File getFile(){
        return file;
    }

    public Scanner getFileScanner(){
        try{
            return new Scanner(file);
        }catch(FileNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
}
