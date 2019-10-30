package ca.khashayar;

public class RegularExpressions {
    public static void RE() {
        String str = "I love. My love but my love doesnt love as I love my love";
        String betterStr = str.replace( "doesnt", "doesn't");
        System.out.println(betterStr);
        // dot means any char in the regex
        System.out.println(betterStr.replaceAll(".", "="));
        //replace is checking the target not the regex
        System.out.println(betterStr.replace(".", "="));
        // for escape the char we use \\ escape sequence
        System.out.println(betterStr.replaceAll("\\.", "!"));
        // for checking the first part of string we are using ^ at the beginning
        System.out.println(betterStr.replaceAll("^I love", "I am in love"));
        // for checking the last part of string we are using $ at the end.
        System.out.println(betterStr.replaceAll("love$", "LOVE"));
        System.out.println("\u001B[31m" + "this is going to be red" + "\u001B[0m");
        System.out.println("\u001B[32m" + "????" + "\u001B[0m");
        blue("this is blue!");
        red("this is red right?");
        // replace each o and e individually with *

        red(betterStr.replaceAll("[oe]" , "*"));
        System.out.println(betterStr.replaceAll("[oe]" , "\u001B[31m*\u001B[0m"));
        blue(betterStr.toUpperCase());
        blue(betterStr.toLowerCase());
        //all the v and t chars which is after o or u will be replaced
        red(betterStr.replaceAll("[ou] [vt]" , "x"));
        String password = "your email password is iTdCanda2019!";
        //change all the itdc chars to ITDC , check both the upper and lower case.
        System.out.println(password.replaceAll("[i|I][t|T][d|D][c|C]" , "ITDC"));
        System.out.println(password.replaceAll("[iI][tT][dD][cC]" , "ITDC"));
        ///replace every char except i t d c with *
        blue(password.replaceAll("[your emilpsdwTCn019!]" , "*"));
        //easier way to check
        red(password.replaceAll("[^a2]" , "*"));
        //you can check with range
        blue(password.replaceAll("[b-zS-X0-13-9!]" ,"*"));
        //its case sensitive
        blue(password.replaceAll("(?i)[b-z0-13-9!]" ,"*"));
        //replace the digits only
        System.out.println(password.replaceAll("\\d" , "*"));
        //replace not the digits only
        System.out.println(password.replaceAll("\\D" , "*"));
        // replace if its not a whitespace excluding punc
        red(password.replaceAll("\\w" , "*"));
        // replace if its a whitespace excluding punc
        blue(password.replaceAll("\\W" , "*"));
        // replace whitespaces including punc
        blue(password.replaceAll("\\s" , "*"));
        // replace if its not whitespaces or punc
        red(password.replaceAll("\\S" , "*"));
        String secret = "11aa222bbb333cc44dd";
        //{} will check the char before (in this case a repeated 2 times)
        System.out.println(secret.replaceAll("^11a{2}","x"));
        //+ will check the char before if repeats any time(in this case all a will be replace)
        System.out.println(secret.replaceAll("^11a+", "X"));
        // * will check if there is 0 or more char after previous
        blue(secret.replaceAll("^11a*","X"));
        //check if repeated min and max limit
        red(secret.replaceAll("b{2,5}","-")); //in a sequence
        String phoneNumber = "(604) 704-4342";
        System.out.println(phoneNumber.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$" ));
        System.out.println(betterStr.matches(".*my love*."));
        String ref1 = new String("peter pan");
        String ref2 = new String("peter pan");
        // == operator will check the ref are pointing to the same memory address
        // .equals() checks if the values are same
        //if(ref1 == ref2){
        if(ref1.equals(ref2)){
            System.out.println("ref1 is == to ref2");
        }else{
            System.out.println("ref1 is not same with ref2");

        }
        // SELECT * FROM table WHERE id = 10
        StringBuilder query = new StringBuilder("SELECT * FROM");
        query.append(" table");
        query.append(" WHERE");
        query.append(" id =");
        query.append(" 10");
        red(query.toString());
        //substring is for creating string from another string.
        blue(str.substring(0,7));
        String name = "helloworld";
        char [] charArr = name.toCharArray();
        String email = "        gh.khashayar@yahoo.com     ";
        blue(email.trim());


    }
    public static void red (String msg){
        System.out.println("\u001B[31m" + msg + "\u001B[0m");
    }
    public static void blue (String msg){
        System.out.println("\u001B[36m" + msg + "\u001B[0m");
    }

    }

