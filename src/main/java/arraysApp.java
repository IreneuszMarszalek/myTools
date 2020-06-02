public class arraysApp {
    public static void main(String[] args) {
        float[] floatTbl = {2,3,4,5};
        double[] doubleTbl = {1.1, 2.2,3.3,4.4,5.5};
        String[] stringTbl = {"1","2","3","4","1"};
        char[] charTbl = {'1','2','3','4','1'};

        System.out.println("sumOfArrayItems");
        System.out.println(arraysTools.Arrays.sumOfAllItems(floatTbl));
        System.out.println(arraysTools.Arrays.sumOfAllItems(doubleTbl));
        System.out.println(arraysTools.Arrays.sumOfAllItems(stringTbl));
        System.out.println(arraysTools.Arrays.sumOfAllItems(charTbl));

        System.out.println("countItemFromArray");
        System.out.println(arraysTools.Arrays.countItemAppearances(1,floatTbl));
        System.out.println(arraysTools.Arrays.countItemAppearances(1.1,doubleTbl));
        System.out.println(arraysTools.Arrays.countItemAppearances("1",stringTbl));
        System.out.println(arraysTools.Arrays.countItemAppearances('1',charTbl));

        System.out.println("min");
        System.out.println(arraysTools.Arrays.min(floatTbl));
        System.out.println(arraysTools.Arrays.min(doubleTbl));

        System.out.println("max");
        System.out.println(arraysTools.Arrays.max(floatTbl));
        System.out.println(arraysTools.Arrays.max(doubleTbl));

        System.out.println("item at");
        System.out.println(arraysTools.Arrays.itemAt(4, floatTbl));
        System.out.println(arraysTools.Arrays.itemAt(4.4, doubleTbl));
        System.out.println(arraysTools.Arrays.itemAt("4", stringTbl));
        System.out.println(arraysTools.Arrays.itemAt('4', stringTbl));
        System.out.println(arraysTools.Arrays.itemAt('4', charTbl));

        System.out.println("item at WithSentry");
        System.out.println(arraysTools.Arrays.itemAtWithSentry(4, floatTbl));
        System.out.println(arraysTools.Arrays.itemAtWithSentry(4.4, doubleTbl));
        System.out.println(arraysTools.Arrays.itemAtWithSentry("4", stringTbl));
        System.out.println(arraysTools.Arrays.itemAtWithSentry('1', stringTbl));
        System.out.println(arraysTools.Arrays.itemAtWithSentry('a', charTbl));
    }
}
