package Regex;

import java.util.regex.Pattern;

public class date {
    public static void date () {
        Pattern pattern = Pattern.compile("^\\d{4}-(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sept|Oct|Nov|Dec)-\\d{2}$");
        System.out.println(pattern.matcher("2022-Oct-17").find());
        System.out.println(pattern.matcher("2022-Oct-177").find());
        System.out.println(pattern.matcher("999-01-01").find());
        System.out.println(pattern.matcher("1999-November-29").find());
        System.out.println(pattern.matcher("2023-Abc-17").find());
    }

    public static void main(String[] args) {
        date();
    }
}
