package Task2;

public class ThirdTaskSolution {
        public static int[] twoSum(int[] nums, int target) {
            int [] result = new int [2];
            for (int i = 0; i <= nums.length - 2; i++) {
                for (int i1 = i+1; i1 <= nums.length - 1; i1++) {
                    int sum = nums [i] + nums [i1];

                    if (sum == target) {
                        result[0] = i;
                        result[1] = i1;
                    break;
                    }
                    else continue;
                }}
return result;
        }
    public static void main(String[] args) {
            int intArray [] = {0,100,10,5,-1};
            int target = 9;
            int twoSum [] = twoSum(intArray, target);
            for (int i=0; i<twoSum.length; i++) {
                System.out.println(twoSum[i]);
            }


    }
}
