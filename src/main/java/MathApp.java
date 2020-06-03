public class MathApp {
    public static void main(String[] args) {
        int x = 0;
        int y = -1;
        int[] intArray = {2,2,2,2,2,2,2,2,2,2};

        System.out.println(mathTools.Math.abs(x));
        System.out.println(mathTools.Math.abs(y));

        System.out.println(mathTools.Math.sumOfDigitsFromInteger(10));
        System.out.println(mathTools.Math.power(10,2));
        System.out.println(mathTools.Math.arithmeticAverage(intArray));
        System.out.println(mathTools.Math.isEven(1));
    }
}
