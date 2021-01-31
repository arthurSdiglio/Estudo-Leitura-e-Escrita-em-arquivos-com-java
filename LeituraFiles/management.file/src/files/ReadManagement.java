package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public final class ReadManagement {
    private String path;

    public ReadManagement(){
        this.path = "C:\\Users\\User\\Desktop\\entrada.txt";
    }

    public ReadManagement(String path){
        this.path = path;
    }

    public BufferedReader getNewFileReader(final String path) throws IOException {
        if (path != null) {
            try {
                return new BufferedReader(new FileReader(path));
            } catch (Exception e) {
                System.out.println("Arquivo não encontrado.");
            }
        }
        return new BufferedReader(new FileReader(this.path));
    }

    public BufferedReader getFileReader() throws FileNotFoundException {
        return new BufferedReader(new FileReader(this.path));
    }

    public void reader() throws IOException {
        BufferedReader file = getFileReader();
        String line = file.readLine();

        while (true) {
            if (line != null) {
                System.out.println(line);
            } else break;
            line = file.readLine();
        }
    }

    //Getters and Setters
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
