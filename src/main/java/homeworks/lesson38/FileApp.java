package homeworks.lesson38;

import java.io.*;

public class FileApp {
    public static final String RESOURCE = "src/main/java/homeworks/lesson38/files/";

    public static void main(String[] args) {
        try {
            File txt = new File(RESOURCE + "metn.txt");
            FileWriter fileWriter = new FileWriter(txt);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("abbas ,1243j,2-3");
            bufferedWriter.close();
            fileWriter.close();
            FileReader fileReader = new FileReader(txt);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            File file = new File(RESOURCE + "metn2.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Saams m");
            bufferedWriter.close();
            fileWriter.close();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}