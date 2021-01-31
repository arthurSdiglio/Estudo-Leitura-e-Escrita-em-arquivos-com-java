package runners;

import controller.ControllerOperationsArithmetics;
import files.ReadManagement;
import files.WriteManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Runner {
    public static void main(String[] args) throws IOException {
        Function<String[], int[]> converter = (values) -> {
            int[] result = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                result[i] = Integer.parseInt(values[i]);
            }
            return result;
        };

        ControllerOperationsArithmetics cl = new ControllerOperationsArithmetics();
        ReadManagement rm = new ReadManagement();
        WriteManagement wm = new WriteManagement();

        BufferedReader fileInput = rm.getFileReader();
        BufferedWriter fileOutput = wm.getFileWriter();
        String line = "";

        try {
            String operacao = "";
            int[] values;

            while (true) {
                line = fileInput.readLine();
                if (line != null) {
                    String[] input = line.split(" ");
                    values = converter.apply(input);

                    line = fileInput.readLine();
                    if(line != null){
                        operacao = line.strip().toLowerCase();
                    }else break;

                    String result = String.valueOf(cl.executeOperation(operacao, values));
                    fileOutput.write("Resultado: " + result + "\n");
                    fileOutput.flush();
                }else break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
