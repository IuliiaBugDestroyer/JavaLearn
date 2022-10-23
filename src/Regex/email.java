package Regex;

import java.util.regex.Pattern;

public class email {
    public static void email () {
        Pattern pattern = Pattern.compile("^\\S+@\\S+\\.\\S+$");
        System.out.println(pattern.matcher("123@mail.com").find());
        System.out.println(pattern.matcher("123mail.com").find());
        System.out.println(pattern.matcher("@gmail.com").find());
        System.out.println(pattern.matcher("123@gmail.co.uk").find());
        System.out.println(pattern.matcher("asdasd@gmail").find());
    }

    public static void main(String[] args) {
        email();
    }
}