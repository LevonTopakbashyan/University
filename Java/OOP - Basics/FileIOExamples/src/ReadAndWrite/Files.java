package ReadAndWrite;

import java.io.*;

public class Files {

    public static void main(String[] args) {

        File file = new File("SomeFile.txt");

        BufferedReader br = null;

        try {

            file.createNewFile();

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            String something = "Kris";
            bw.write(something);
            bw.close();

            br = new BufferedReader(new FileReader(file));
            String readed;

            while ((readed = br.readLine()) != null){
                System.out.println(readed);
            }

            br.close();




        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
