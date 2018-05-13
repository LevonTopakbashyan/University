package FileIOExamples;

import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        File file = new File("Kris.txt");

        FileWriter fw = null;
        BufferedWriter bw = null;
        BufferedReader br = null;

        try{
            file.createNewFile();

            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            bw.write(name);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
        try {
            br = new BufferedReader(new FileReader(file));
            String gosho;

            while ((gosho = br.readLine()) != null) {
                System.out.println(gosho);
            }
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            try {
                br.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }

}
