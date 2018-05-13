package FileIOExamples;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

public class FileReader {

    public static void main(String[] args) {


        String textFromFile = "";
        BufferedReader br = null;

        try {

            br = new BufferedReader(new java.io.FileReader("test.txt"));
            String line;

            while ((line = br.readLine()) != null){
                textFromFile += line;
            }

            br.close();

        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(textFromFile);

        String email = regexChecker("[A-Za-z0-9-_]+@[A-Za-z0-9-_]+\\.[A-Za-z]{2,4}",textFromFile);
        String phoneNumber = regexChecker("[0-9]{10}",textFromFile);

        System.out.println(phoneNumber);

        System.out.println(email);

        int number = Integer.parseInt(phoneNumber);

        HashMap<String , Integer> addresses = new HashMap<>();

        addresses.put(email,number);

        for (Map.Entry<String,Integer> entry : addresses.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    public static String regexChecker(String myRegex, String stringToCheck){

        Pattern pattern = Pattern.compile(myRegex);

        Matcher matcher = pattern.matcher(stringToCheck);

        while (matcher.find()){

            if (matcher.group().length() != 0){
                return matcher.group().trim();
            }
        }
        return matcher.group().trim();
    }
}
