package stringTools;

import static interfaceProviders.ParametersProvider.*;

public class AsciiConverter {
    static final char SEPARATOR = '|';

    //
    //    Converts String delivered via Interface
    //    Prints result with SEPARATOR
    //
    public static void asciiCodePrint (){
        String text = provideString("Enter the string to be converted: ");
        char[] letterFromTextTable = text.toCharArray();
        int index = 1;
        for ( char letter: letterFromTextTable ) {
            if (index != letterFromTextTable.length) {
                letterAsciiCodePrint(letter, false);
                index++;
            }else{
                letterAsciiCodePrint(letter, true);
            }
        }
    }

    //
    //    Converts String delivered via method parameter
    //    Prints result with SEPARATOR
    //
    public static void asciiCodePrint (String text){
        char[] letterFromTextTable = text.toCharArray();
        int index = 1;
        for ( char letter: letterFromTextTable ) {
            if (index != letterFromTextTable.length) {
                letterAsciiCodePrint(letter, false);
                index++;
            }else{
                letterAsciiCodePrint(letter, true);
            }
        }
    }

    //
    //    Converts String delivered via Interface
    //    Returns result as String with SEPARATOR
    //
    public static String asciiCodeReturn (){
        String text = provideString("Enter the string to be converted: ");
        char[] letterFromTextTable = text.toCharArray();
        StringBuilder result = new StringBuilder();
        int index = 1;
        for ( char letter: letterFromTextTable ) {
            if (index != letterFromTextTable.length) {
                result.append(letterAsciiCodeReturn(letter, false));
                index++;
            }else{
                result.append(letterAsciiCodeReturn(letter, true));
            }
        }
        return result.toString();
    }

    //
    //    Converts String delivered via Interface
    //    Returns result as String with SEPARATOR
    //
    public static String asciiCodeReturn (String text){
        char[] letterFromTextTable = text.toCharArray();
        StringBuilder result = new StringBuilder();
        int index = 1;
        for ( char letter: letterFromTextTable ) {
            if (index != letterFromTextTable.length) {
                result.append(letterAsciiCodeReturn(letter, false));
                index++;
            }else{
                result.append(letterAsciiCodeReturn(letter, true));
            }
        }
        return result.toString();
    }

    //
    //    Converts char to ASCII
    //    Prints result with SEPARATOR
    //
    public static void letterAsciiCodePrint (char letter, boolean lastLetter){
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
    public static String letterAsciiCodeReturn (char letter, boolean lastLetter){
        StringBuilder result = new StringBuilder();
        if (!lastLetter) {
            result.append((int) letter);
            result.append(SEPARATOR);
        }else{
            result.append((int) letter);
        }
        return result.toString();
    }
}
