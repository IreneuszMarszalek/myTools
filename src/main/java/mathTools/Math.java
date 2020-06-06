package mathTools;

import arraysTools.Arrays;

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

    public static int max(int... array){
        int max = array[0];
        if (array.length == 0){
            return 0;
        }

        if (array.length == 1){
            return max;
        }

        for (int a:array) {
            if (a > max){
                max = a;
            }
        }

        return max;
    }

    public static int firstDominant(int... array){
        int [][] tempTbl = dominantAnalysis(array);

        int max = max(tempTbl[1]);
        int index = 0;

        for (int a:tempTbl[1]) {
            if (a == max){
                break;
            }
            index++;
        }

        return tempTbl[0][index] ;
    }

    public static int[][] dominantAnalysis(int... array){
        int [][] tempTbl = new int[2][array.length];
        int newIndex;

        for (int a:array) {
            if(!ifExistsInIntArray(a, tempTbl[0])){
                newIndex = findFirstEmptyIndexFromIntArray(tempTbl[1]);
                tempTbl[0][newIndex] = a;
                tempTbl[1][newIndex] = 1;
            }else{
                newIndex = findIndexOfItemFromIntArray(a,tempTbl[0]);
                tempTbl[1][newIndex]++;
            }
        }

        return tempTbl;
    }

    private static boolean ifExistsInIntArray (int number, int... array){
        if (array.length == 0){
            return false;
        }

        for (int a:array) {
            if (number == a){
                return true;
            }
        }

        return false;
    }

    private static int findFirstEmptyIndexFromIntArray (int... array){
        int result = 0;
        int index = 0;
        for (int a:array) {
            if(a == 0 ){
                result = index;
                break;
            }
            index++;
        }
        return result;
    }

    private static int findIndexOfItemFromIntArray(int number, int... array){
        if(!ifExistsInIntArray(number, array)){
            return -1;
        }

        int index = 0;
        for (int a:array) {
            if(a == number){
                break;
            }
            index++;
        }

        return index;
    }

}
