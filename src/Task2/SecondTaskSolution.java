package Task2;

public class SecondTaskSolution {
    public static boolean isPalindrome(Integer x) {
        String inputAssString = x.toString();
        String result = "";
        char[] array = inputAssString.toCharArray();
for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return inputAssString.contentEquals(result);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome (56565));
    }
}
