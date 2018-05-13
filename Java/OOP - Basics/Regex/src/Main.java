import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234";
        String strangeString = "1Z aaa **** *** {{{ {{ { ";



        //regexChecker("\\s[A-Za-z]{2,20}\\s",longString);
        regexChecker("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}",longString);

    }

    public static void regexChecker(String theRegex, String stringToCheck){

        Pattern pattern = Pattern.compile(theRegex);

        Matcher matcher = pattern.matcher(stringToCheck);

        while (matcher.find()){

            if (matcher.group().length() != 0 ){
                System.out.println(matcher.group().trim());
            }
        }
    }
}
