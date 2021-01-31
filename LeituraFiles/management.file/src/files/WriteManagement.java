package files;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteManagement {
    private String path;

    public WriteManagement(){
        this.path = "C:\\Users\\User\\Desktop\\saida.txt";
    }

    public BufferedWriter getNewFileWriter(final String path) throws IOException {
        if (path != null) {
            try {
                return new BufferedWriter(new FileWriter(path));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new BufferedWriter(new FileWriter(this.path));
    }

    public BufferedWriter getFileWriter() throws IOException {
        return new BufferedWriter(new FileWriter(this.path));
    }

    public void writer(final String string) {
        try {
            BufferedWriter bw = getNewFileWriter("C:\\Users\\User\\Desktop\\saida.txt");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
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
