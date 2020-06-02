public class arraysApp {
    public static void main(String[] args) {
        float[] floatTbl = {1, 2,3,4,5};
        double[] doubleTbl = {1.1, 2.2,3.3,4.4,5.5};
        String[] stringTbl = {"1","2","3","4"};
        char[] charTbl = {'1','2','3','4'};

        System.out.println(arraysTools.Arrays.sumOfArrayItems(floatTbl));
        System.out.println(arraysTools.Arrays.sumOfArrayItems(doubleTbl));
        System.out.println(arraysTools.Arrays.sumOfArrayItems(stringTbl));
        System.out.println(arraysTools.Arrays.sumOfArrayItems(charTbl));
    }
}
