package Regex;

import java.util.regex.Pattern;

public class isbn {
    public static void isbn () {
      //Pattern pattern = Pattern.compile("^(?:ISBN(?:-{10,13})?:?)?(\\d-?){10}$"); я не поняла почему оно не работает, хотела сделать ISBN плюс просто 10 чисел, но не вышло
        Pattern pattern = Pattern.compile("^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$");

        System.out.println(pattern.matcher("ISBN-10 0-596-52068-9").find());
        System.out.println(pattern.matcher("ISBN-13: 978-0-596-52068-7").find());
        System.out.println(pattern.matcher("978 0 596 52068 7").find());
        System.out.println(pattern.matcher("0-596-52068-9").find());
        System.out.println(pattern.matcher("9780596520687").find());
    }

    public static void main(String[] args) {
        isbn();
    }
}
