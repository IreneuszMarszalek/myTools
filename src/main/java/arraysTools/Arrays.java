package arraysTools;

public class Arrays {
        public static float sumOfArrayItems(float... arrays){
            float result=0;
            for (float a:arrays) {
                result+=a;
            }
            return result;
        }

    public static double sumOfArrayItems(double... arrays){
        float result=0;
        for (double a:arrays) {
            result+=a;
        }
        return result;
    }

    public static String sumOfArrayItems(String... arrays){
        StringBuilder result = new StringBuilder();
        for (String a:arrays) {
            result.append(a);
        }
        return result.toString();
    }

    public static String sumOfArrayItems(char... arrays){
        StringBuilder result = new StringBuilder();
        for (char a:arrays) {
            result.append(a);
        }
        return result.toString();
    }
}
