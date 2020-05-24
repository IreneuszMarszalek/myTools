package encryption;

import static interfaceProviders.ParametersProvider.provideString;

public class CipherWithAnyOffset {
    static private final int SHIFT = 3;

    public static void printEncryption(){
        String toEncryptText = normalizeText(provideString("Podaj tekst do zaszyfrowania:"));
        char[] toEncryptLetterTbl = toEncryptText.toCharArray();
        printEncryptionLetterTbl(toEncryptLetterTbl);
    }

    public static void printEncryption(String toEncrypt){
        String toEncryptText = normalizeText(toEncrypt);
        char[] toEncryptLetterTbl = toEncryptText.toCharArray();
        printEncryptionLetterTbl(toEncryptLetterTbl);
    }

    public static String fetchEncryption(){
        String toEncryptText = normalizeText(provideString("Podaj tekst do zaszyfrowania:"));
        char[] toEncryptLetterTbl = toEncryptText.toCharArray();
        return fetchEncryptionLetterTbl(toEncryptLetterTbl);
    }

    public static String fetchEncryption(String toEncrypt){
        String toEncryptText = normalizeText(toEncrypt);
        char[] toEncryptLetterTbl = toEncryptText.toCharArray();
        return fetchEncryptionLetterTbl(toEncryptLetterTbl);
    }

    public static void printDecryption(){
        String toDecryptText = normalizeText(provideString("Podaj tekst do odszyfrowania:"));
        char[] toDecryptLetterTbl = toDecryptText.toCharArray();
        printDecryptionLetterTbl(toDecryptLetterTbl);
    }

    public static void printDecryption(String toDecrypt){
        String toDecryptText = normalizeText(toDecrypt);
        char[] toDecryptLetterTbl = toDecryptText.toCharArray();
        printDecryptionLetterTbl(toDecryptLetterTbl);
    }

    public static String fetchDecryption(){
        String toDecryptText = normalizeText(provideString("Podaj tekst do odszyfrowania:"));
        char[] toDecryptLetterTbl = toDecryptText.toCharArray();
        return fetchDecryptionLetterTbl(toDecryptLetterTbl);
    }

    public static String fetchDecryption(String toDecrypt){
        String toDecryptText = normalizeText(toDecrypt);
        char[] toDecryptLetterTbl = toDecryptText.toCharArray();
        return fetchDecryptionLetterTbl(toDecryptLetterTbl);
    }

    // small letters ASCII code from 97 to 122
    private static char encryptSmallLetters (char smallLetter){
        char result;

        if ((int) smallLetter + SHIFT > 122) {
            result = (char) (((int) smallLetter + SHIFT)-26);
        }else {
            result = (char) ((int) smallLetter + SHIFT);
        }
        return result;
    }

    // small letters ASCII code from 97 to 122
    private static char decryptSmallLetters (char smallLetter){
        char result;

        if ((int) smallLetter - SHIFT < 97) {
            result = (char) (((int) smallLetter - SHIFT)+26);
        }else {
            result = (char) ((int) smallLetter - SHIFT);
        }
        return result;
    }

    // big letters ASCII code from 65 to 90
    private static char encryptBigLetters (char bigLetter){
        char result;

        if ((int) bigLetter + SHIFT > 90) {
            result = (char) (((int) bigLetter + SHIFT)-26);
        }else {
            result = (char) ((int) bigLetter + SHIFT);
        }
        return result;
    }

    // big letters ASCII code from 65 to 90
    private static char decryptBigLetters (char bigLetter){
        char result;

        if ((int) bigLetter - SHIFT < 65) {
            result = (char) (((int) bigLetter - SHIFT)+26);
        }else {
            result = (char) ((int) bigLetter - SHIFT);
        }
        return result;
    }

    // big letters ASCII code from 48 to 57
    private static char encryptDigits (char digit){
        char result;

        if ((int) digit + SHIFT > 57) {
            result = (char) (((int) digit + SHIFT)-10);
        }else {
            result = (char) ((int) digit + SHIFT);
        }
        return result;
    }

    // big letters ASCII code from 48 to 57
    private static char decryptDigits (char digit){
        char result;

        if ((int) digit - SHIFT < 48) {
            result = (char) (((int) digit - SHIFT)+10);
        }else {
            result = (char) ((int) digit - SHIFT);
        }
        return result;
    }

    private static String normalizeText (String toNormalizeText){
        char[] toNormalizeCharTbl = toNormalizeText.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char letter:toNormalizeCharTbl) {
            if (((int) letter >= 65 && (int) letter <=90) || ((int) letter >= 97 && (int) letter <=122) || ((int) letter >= 48 && (int) letter <=57)){
                result.append(letter);
            }
        }
        return result.toString();
    }

    private static void printEncryptionLetterTbl(char[] toEncryptLetterTbl) {
        StringBuilder result = new StringBuilder();

        for (char letter: toEncryptLetterTbl) {
            switch (checkLetterType(letter)) {
                case 'S':   result.append(encryptSmallLetters(letter));
                    break;
                case 'B':   result.append(encryptBigLetters(letter));
                    break;
                case 'D':   result.append(encryptDigits(letter));
                    break;
            }
        }
        System.out.print(result.toString());
    }

    private static void printDecryptionLetterTbl(char[] toDecryptLetterTbl) {
        StringBuilder result = new StringBuilder();

        for (char letter: toDecryptLetterTbl) {
            switch (checkLetterType(letter)) {
                case 'S':   result.append(decryptSmallLetters(letter));
                    break;
                case 'B':   result.append(decryptBigLetters(letter));
                    break;
                case 'D':   result.append(decryptDigits(letter));
                    break;
            }
        }
        System.out.print(result.toString());
    }

    private static String fetchEncryptionLetterTbl(char[] toEncryptLetterTbl) {
        StringBuilder result = new StringBuilder();

        for (char letter: toEncryptLetterTbl) {
            switch (checkLetterType(letter)) {
                case 'S':   result.append(encryptSmallLetters(letter));
                    break;
                case 'B':   result.append(encryptBigLetters(letter));
                    break;
                case 'D':   result.append(encryptDigits(letter));
                    break;
            }
        }
        return result.toString();
    }

    private static String fetchDecryptionLetterTbl(char[] toDecryptLetterTbl) {
        StringBuilder result = new StringBuilder();

        for (char letter: toDecryptLetterTbl) {
            switch (checkLetterType(letter)) {
                case 'S':   result.append(decryptSmallLetters(letter));
                    break;
                case 'B':   result.append(decryptBigLetters(letter));
                    break;
                case 'D':   result.append(decryptDigits(letter));
                    break;
            }
        }
        return result.toString();
    }

    private static char checkLetterType (char letter){
        char result = 0;
        if ((int) letter >= 65 && (int) letter <=90){
            result = 'B';   //Big letters
        }else if ((int) letter >= 97 && (int) letter <=122){
            result = 'S';   // Small letters
        }else if ((int) letter >= 48 && (int) letter <=57){
            result = 'D';   // Digits
        }
        return result;
    }
}
