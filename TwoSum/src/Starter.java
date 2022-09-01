import java.util.Arrays;

public class Starter {


    public static void start(int[] testArray, int testTarget) {
        System.out.println("Test array:" + Arrays.toString(testArray));
        System.out.println("Test target:" + testTarget);
        System.out.println("Result:" + Arrays.toString(new Solution().twoSum(testArray, testTarget)));
    }

    public static void main(String[] args) {
        int[] testArray1 = new int[] {-1, 10, 11, 14, 4};
        int testTarget1 = 15;
//        int[] testArray1 = new int[] {3,2,4};
//        int testTarget1 = 6;
//        int[] testArray1 = new int[] {3,3};
//        int testTarget1 = 6;

        //
        start(testArray1, testTarget1);
    }

}
