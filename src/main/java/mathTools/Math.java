package mathTools;

public class Math {
    public static int abs(int x){
        return (x>=0)?x:(-1*x);
    }

    public static int sumOfDigitsFromInteger (int integerNumber){
        int result = 0;
        while (integerNumber!=0){
            result += integerNumber%10;
            integerNumber = integerNumber / 10;
        }
        return result;
    }

    public static double power(int a, int b){
        double result =1;
        boolean reverse = false;
        if (b<0){
            reverse = true;
        }
        b = abs(b);

        while (b>0){
            result *= a;
            b--;
        }

        if(reverse){
            result = 1/result;
        }
        return result;
    }

    public static int arithmeticAverage(int... array){
        int result = 0;
        for (int a:array) {
            result += a;
        }
        return result/array.length;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
