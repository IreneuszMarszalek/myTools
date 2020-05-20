package stringTools;

import javax.xml.crypto.dsig.spec.XPathType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static interfaceProviders.ParametersProvider.*;

public class AsciiConverter {
    static final char SEPARATOR = '|';

    public static void printFromAscii(String ascii){
        if(validateInputString(ascii)){

        }else
            System.out.println("Incorrect input string");
    }

    //
    //    Converts String delivered via Interface
    //    Prints result with SEPARATOR
    //
    public static void printAscii (){
        String text = provideString("Enter the string to be converted: ");
        char[] letterFromTextTable = text.toCharArray();
        printAsciiFromCharArgs(letterFromTextTable);
    }

    //
    //    Converts String delivered via method parameter
    //    Prints result with SEPARATOR
    //
    public static void printAscii (String text){
        char[] letterFromTextTable = text.toCharArray();
        printAsciiFromCharArgs(letterFromTextTable);
    }

    //
    //    Converts String delivered via Interface
    //    Returns result as String with SEPARATOR
    //
    public static String fetchAscii (){
        String text = provideString("Enter the string to be converted: ");
        char[] letterFromTextTable = text.toCharArray();
        StringBuilder result = getAsciiFromCharArgs(letterFromTextTable);
        return result.toString();
    }

    //
    //    Converts String delivered via Interface
    //    Returns result as String with SEPARATOR
    //
    public static String fetchAscii (String text){
        char[] letterFromTextTable = text.toCharArray();
        StringBuilder result = getAsciiFromCharArgs(letterFromTextTable);
        return result.toString();
    }

    //
    //    Converts char to ASCII
    //    Prints result with SEPARATOR
    //
    private static void printLetterAscii (char letter, boolean lastLetter){
        if (!lastLetter) {
            System.out.print((int) letter);
            System.out.print(SEPARATOR);
        }else{
            System.out.print((int) letter);
        }
    }

    //
    //    Converts char to ASCII
    //    Returns result with SEPARATOR
    //
    private static String fetchLetterAscii (char letter, boolean lastLetter){
        StringBuilder result = new StringBuilder();
        if (!lastLetter) {
            result.append((int) letter);
            result.append(SEPARATOR);
        }else{
            result.append((int) letter);
        }
        return result.toString();
    }

    //
    //    Prints ASCII from char Args
    //    Returns result with SEPARATOR
    //
    private static void printAsciiFromCharArgs(char... letterFromTextTable) {
        int index = 1;
        for ( char letter: letterFromTextTable ) {
            if (index != letterFromTextTable.length) {
                printLetterAscii(letter, false);
                index++;
            }else{
                printLetterAscii(letter, true);
            }
        }
    }

    //
    //    Returns ASCII from char Args
    //    Returns result with SEPARATOR
    //
    private static StringBuilder getAsciiFromCharArgs(char... letterFromTextTable) {
        StringBuilder result = new StringBuilder();
        int index = 1;
        for (char letter : letterFromTextTable) {
            if (index != letterFromTextTable.length) {
                result.append(fetchLetterAscii(letter, false));
                index++;
            } else {
                result.append(fetchLetterAscii(letter, true));
            }
        }
        return result;
    }

    private static boolean validateInputString (String toValidate){
        char[] charTbl = toValidate.toCharArray();
        boolean result = true;

        if (!Character.isDigit(toValidate.charAt(0))){
            result = false;
        }

        if (!Character.isDigit(toValidate.charAt(toValidate.length()-1))){
            result = false;
        }

        if(result) {
            for (char sign : charTbl) {
                if (!(Character.isDigit(sign) || sign == '|')) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
