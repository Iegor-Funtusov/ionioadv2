package ua.com.alevel.crud;

import java.io.*;

public class ReadWriteFile {

    public void readFile(String pathToFile) {
        InputStream inputStream;
        OutputStream outputStream;

        Reader reader;
        Writer writer;

        System.out.println("");

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        String thisLine = null;
//        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
//            while ((thisLine = bufferedReader.readLine()) != null) {
//                System.out.println(thisLine);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToFile, true))) {
            bufferedWriter.write("\n");
            bufferedWriter.write("\n text");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
