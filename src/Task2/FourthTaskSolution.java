package Task2;

public class FourthTaskSolution {
    public static int mySqrt(int x) {
        if (x < 2) return x;
        int i=1;
        while (i*i<=x){
            if(i*i<=0) break;
            i++;
        }
        return --i;
    }
     /*   {
            Math.sqrt(x);
        return (int) Math.sqrt(x);
        }*/
    public static void main(String[] args) {
        System.out.println(mySqrt(121));
    }
}
