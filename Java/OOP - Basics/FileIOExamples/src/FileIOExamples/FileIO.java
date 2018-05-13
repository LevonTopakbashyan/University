package FileIOExamples;

import java.io.*;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        try {

            File file = new File("test.txt");

            boolean isCreated = file.createNewFile();

            FileWriter fw = new FileWriter("test.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String name = console.nextLine();

            bw.write(name);
            bw.close();

            if (isCreated){
                System.out.println("File is created correctly");
            }
            else {
                System.out.println("File is already created");
            }

        }catch (IOException e){

            e.printStackTrace();
        }
    }
}
