package Regex;

import java.util.regex.Pattern;

public class number {
    public static void number () {
        Pattern pattern = Pattern.compile("^[+]?\\d{1,3}[-]?\\d+$");
        System.out.println(pattern.matcher("").find());
        System.out.println(pattern.matcher("123 456").find());
        System.out.println(pattern.matcher("+79049999999").find());
        System.out.println(pattern.matcher("123@gmail.co.uk").find());
        System.out.println(pattern.matcher("911").find());
    }

    public static void main(String[] args) {
        number();
    }
}
