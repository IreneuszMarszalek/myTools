package stringTools;

import java.time.LocalDate;

public class PeselValidator {
    public static boolean validatePesel (String pesel){
        boolean result = true;
        LocalDate birthDate =LocalDate.MIN;

        //check length and if contains only digits
        if(!checkPeselDigits(pesel)){
            result = false;
        }

        if(result){
            result = peselCheckSum(pesel);
        }

        return result;
    }

    public static LocalDate getBirthDay(String pesel){
        LocalDate birthDay = LocalDate.MIN;

        if (validatePesel(pesel)){
            birthDay = LocalDate.of(getYear(pesel), getMonth(pesel), getDay(pesel));
        }

        return birthDay;
    }

    public static char getGender (String pesel){
        char result = 'X';
        char[] peselSignsTbl = pesel.toCharArray();

        int gender;

        int seventhDigit = Integer.parseInt(Character.toString(peselSignsTbl[6]));
        int eighthDigit = Integer.parseInt(Character.toString(peselSignsTbl[7]));
        int ninthDigit = Integer.parseInt(Character.toString(peselSignsTbl[8]));
        int tenthDigit = Integer.parseInt(Character.toString(peselSignsTbl[9]));

        if(validatePesel(pesel)) {

            gender = 1000 * seventhDigit + 100 * eighthDigit + 10 * ninthDigit + tenthDigit;

            if (gender % 2 == 0) {
                result = 'F';
            } else {
                result = 'M';
            }
        }

        return result;
    }

    private static int getYear (String pesel){
        int result = 0;
        char[] peselSignsTbl = pesel.toCharArray();

        int firstDigit = Integer.parseInt(Character.toString(peselSignsTbl[0]));
        int secondDigit = Integer.parseInt(Character.toString(peselSignsTbl[1]));
        int thirdDigit = Integer.parseInt(Character.toString(peselSignsTbl[2]));

        if( thirdDigit < 2 ){
            result = 1900 + firstDigit * 10 + secondDigit;
        }

        if (( thirdDigit == 2 ) || ( thirdDigit == 3 )){
            result = 2000 + firstDigit * 10 + secondDigit;
        }

        return result;
    }

    private static int getMonth (String pesel){
        int result = 0;
        char[] peselSignsTbl = pesel.toCharArray();

        int thirdDigit = Integer.parseInt(Character.toString(peselSignsTbl[2]));
        int fourthDigit = Integer.parseInt(Character.toString(peselSignsTbl[3]));

        if( thirdDigit < 2 ){
            result = thirdDigit * 10 + fourthDigit;
        }

        if ( thirdDigit == 2 ){
            result = (thirdDigit -2) * 10 + fourthDigit;
        }
        if ( thirdDigit == 3 ){
            result = (thirdDigit -2) * 10 + fourthDigit;
        }

        return result;
    }

    private static int getDay (String pesel){
        int result;
        char[] peselSignsTbl = pesel.toCharArray();

        int fifthDigit = Integer.parseInt(Character.toString(peselSignsTbl[4]));
        int sixthDigit = Integer.parseInt(Character.toString(peselSignsTbl[5]));

        result = fifthDigit * 10 + sixthDigit;

        return result;
    }

    private static boolean checkPeselDigits (String pesel){
        boolean result = true;
        char[] peselSignsTbl = pesel.toCharArray();

        if (peselSignsTbl.length!=11){
            result = false;
        }

        if(result){
            for (char sign :peselSignsTbl) {
                if (!Character.isDigit(sign)){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean peselCheckSum (String pesel){
        boolean result = true;
        char[] peselSignsTbl = pesel.toCharArray();

        int[] weights = {1,3,7,9,1,3,7,9,1,3};
        int index = 0;
        long checksum = 0;

        for (char digit: peselSignsTbl) {
            if (index == 10){
                break;
            }
            checksum += Integer.parseInt(Character.toString(digit)) * weights[index];
            index++;
        }

        checksum = checksum%10;
        checksum = 10 - checksum;
        checksum = checksum%10;

        if (checksum!=Integer.parseInt(Character.toString(peselSignsTbl[10]))){
            result = false;
        }

        return result;
    }
}
