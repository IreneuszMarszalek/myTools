import java.util.Arrays;

public class MathApp {
    public static void main(String[] args) {
        int x = 0;
        int y = -1;
        int[] intArray = {2,3,4,4,8,8,8,8,2,1};

        /*System.out.println(mathTools.Math.abs(x));
        System.out.println(mathTools.Math.abs(y));

        System.out.println(mathTools.Math.sumOfDigitsFromInteger(10));
        System.out.println(mathTools.Math.power(10,2));
        System.out.println(mathTools.Math.arithmeticAverage(intArray));
        System.out.println(mathTools.Math.isEven(1));*/

        System.out.println(Arrays.toString(mathTools.Math.dominantAnalysis(intArray)[0]));
        System.out.println(Arrays.toString(mathTools.Math.dominantAnalysis(intArray)[1]));
        System.out.println(mathTools.Math.max(intArray));
        System.out.println(mathTools.Math.firstDominant(intArray));
    }
}
