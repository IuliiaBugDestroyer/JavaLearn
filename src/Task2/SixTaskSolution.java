package Task2;

public class SixTaskSolution {
    public static void Text (int d){
        if (d%3 ==0 && d%5 ==0) {
            System.out.println("Fizz-Buzz");
        } else if (d%3 ==0) {
            System.out.println("Fizz");
        } else if (d%5 ==0) {
            System.out.println("Buzz");
        }
    }

    public static void main(String[] args) {
        Text(15);
        Text(50);
        Text(9);
    }

    }