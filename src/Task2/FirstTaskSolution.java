package Task2;

public class FirstTaskSolution {
        public static int lengthOfLastWord(String s) {

            String [] words = s.split(" ");
        String w1 = words [words.length -1];
            return w1.length();
        }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello Java! monster"));
    }
}