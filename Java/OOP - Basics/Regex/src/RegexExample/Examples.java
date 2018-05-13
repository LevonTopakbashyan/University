package RegexExample;

import java.util.regex.*;

public class Examples {

    public static void main(String[] args) {

        String longString = " Derek Banas CA AK 12345 PA (412)555-1212 johnsmith@hotmail.com";
        String email = "levo_topakbashian@abv.bg i sarkis_topakbashyan@yahoo.com";
        String strangeString = " 1Z aaa **** *** {{{ {{ { ";

        // [A-Za-z0-9] - glavni i malki bukvi + cifri
        // \\s - interval tabulaciq nov red
        // \\d - cifra
        // + - edno ili poveche
        // ()[]{} + * ? . ^ \| - escape-va se s backslash
        // . - vsichko
        // * - 0 ili poveche puti


        //regexChecker("(\\w*)",strangeString);

        regexChecker("[A-Za-z0-9-_%]+@[A-Za-z0-9-_]+\\.[A-Za-z]{2,5}",email);

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