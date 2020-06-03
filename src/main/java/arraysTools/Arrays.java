package arraysTools;

public class Arrays {
        public static float sumOfAllItems(float... array){
            float result=0;
            for (float a:array) {
                result+=a;
            }
            return result;
        }

    public static double sumOfAllItems(double... array){
        float result=0;
        for (double a:array) {
            result+=a;
        }
        return result;
    }

    public static String sumOfAllItems(String... array){
        StringBuilder result = new StringBuilder();
        for (String a:array) {
            result.append(a);
        }
        return result.toString();
    }

    public static String sumOfAllItems(char... array){
        StringBuilder result = new StringBuilder();
        for (char a:array) {
            result.append(a);
        }
        return result.toString();
    }

    public static int countItemAppearances(float item, float... array){
            int result = 0;
        for (float a:array) {
            if (a == item){
                result++;
            }
        }
        return result;
    }

    public static int countItemAppearances(double item, double... array){
        int result = 0;
        for (double a:array) {
            if (a == item){
                result++;
            }
        }
        return result;
    }

    public static int countItemAppearances(String item, String... array){
        int result = 0;
        for (String a:array) {
            if (a.equals(item)){
                result++;
            }
        }
        return result;
    }

    public static int countItemAppearances(char item, char... array){
        int result = 0;
        for (char a:array) {
            if (a == item){
                result++;
            }
        }
        return result;
    }

    public static float min(float... array){
        float min = array[0];
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                if(array[i] < min){
                    min = array[i];
                }
            }
        }
        return min;
    }

    public static double min(double... array){
        double min = array[0];
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                if(array[i] < min){
                    min = array[i];
                }
            }
        }
        return min;
    }

    public static float max(float... array){
        float max = array[0];
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                if(array[i] > max){
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static double max(double... array){
        double max = array[0];
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                if(array[i] > max){
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static int itemAt(float item, float... array){
        int result = -1;
        int index = 0;
        for (float a:array) {
            if(a == item){
                result = index;
                break;
            }
            index++;
        }
        return result;
    }

    public static int itemAt(double item, double... array){
        int result = -1;
        int index = 0;
        for (double a:array) {
            if(a == item){
                result = index;
                break;
            }
            index++;
        }
        return result;
    }

    public static int itemAt(String item, String... array){
        int result = -1;
        int index = 0;
        for (String a:array) {
            if(a.equals(item)){
                result = index;
                break;
            }
            index++;
        }
        return result;
    }

    public static int itemAt(char item, String... array){
        int result = -1;
        int index = 0;
        for (String a:array) {
            if(a.equals(Character.toString(item))){
                result = index;
                break;
            }
            index++;
        }
        return result;
    }

    public static int itemAt(char item, char... array){
        int result = -1;
        int index = 0;
        for (char a:array) {
            if(a == item){
                result = index;
                break;
            }
            index++;
        }
        return result;
    }

    public static int itemAtWithSentry(float item, float... array){
        int arraySize = array.length;
        int result = -1;
        int index = 0;

        float[] tempTbl = java.util.Arrays.copyOf(array, arraySize+1);
        tempTbl[array.length] = item;

        while(true){
            if(tempTbl[index] == item){
                break;
            }
            index++;
        }

        if(index != array.length){
            result = index;
        }

        return result;
    }

    public static int itemAtWithSentry(double item, double... array){
        int arraySize = array.length;
        int result = -1;
        int index = 0;

        double[] tempTbl = java.util.Arrays.copyOf(array, arraySize+1);
        tempTbl[array.length] = item;

        while(true){
            if(tempTbl[index] == item){
                break;
            }
            index++;
        }

        if(index != array.length){
            result = index;
        }

        return result;
    }

    public static int itemAtWithSentry(String item, String... array){
        int arraySize = array.length;
        int result = -1;
        int index = 0;

        String[] tempTbl = java.util.Arrays.copyOf(array, arraySize+1);
        tempTbl[array.length] = item;

        while(true){
            if(tempTbl[index].equals(item)){
                break;
            }
            index++;
        }

        if(index != array.length){
            result = index;
        }

        return result;
    }

    public static int itemAtWithSentry(char item, String... array){
        int arraySize = array.length;
        int result = -1;
        int index = 0;

        String[] tempTbl = java.util.Arrays.copyOf(array, arraySize+1);
        tempTbl[array.length] = Character.toString(item);

        while(true){
            if(tempTbl[index].equals(Character.toString(item))){
                break;
            }
            index++;
        }

        if(index != array.length){
            result = index;
        }

        return result;
    }

    public static int itemAtWithSentry(char item, char... array){
        int arraySize = array.length;
        int result = -1;
        int index = 0;

        char[] tempTbl = java.util.Arrays.copyOf(array, arraySize+1);
        tempTbl[array.length] = item;

        while(true){
            if(tempTbl[index] == item){
                break;
            }
            index++;
        }

        if(index != array.length){
            result = index;
        }

        return result;
    }

    public static int itemAtHalfSearch(float item, float... array){
         int bottom = 0;
         int top = array.length - 1;
         int mid;
         java.util.Arrays.sort(array);

         while(true){
             if (bottom > top){
                 mid = -1;
                 break;
             }

             mid = (bottom + top) / 2;
             if(array[mid] == item){
                 break;
             }
             if(array[mid] < item){
                 bottom = mid + 1;
             }else{
                 top = mid - 1;
             }
         }

         return mid;
    }

    public static int itemAtHalfSearch(double item, double... array){
        int bottom = 0;
        int top = array.length - 1;
        int mid;
        java.util.Arrays.sort(array);

        while(true){
            if (bottom > top){
                mid = -1;
                break;
            }

            mid = (bottom + top) / 2;
            if(array[mid] == item){
                break;
            }
            if(array[mid] < item){
                bottom = mid + 1;
            }else{
                top = mid - 1;
            }
        }

        return mid;
    }
}
