import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        BufferedReader br = null;

        File file = new File("myFile.txt");

        try {
            file.createNewFile();

            FileWriter fw = new FileWriter("myFile.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String name = console.nextLine();

            bw.write(name);
            bw.close();

            br = new BufferedReader(new FileReader("myFile.txt"));

            String line;

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
