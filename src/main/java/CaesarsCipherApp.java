import encryption.CaesarsCipher;

import static encryption.CaesarsCipher.*;

public class CaesarsCipherApp {
    public static void main(String[] args) {
        String toEncrypt = "Ireneusz Marszalek";
        String toDecrypt = "KtgpgwubOctubcngm";

        System.out.println("Caesars Cipher. Text provided via Interface. Result printed");
        printEncryption();

        System.out.println("\n\nCaesars Cipher. Text provided via method parameters. Result printed");
        System.out.println("To encrypt:" + toEncrypt);
        printEncryption(toEncrypt);

        System.out.println("\n\nCaesars Cipher. Text provided via Interface. Result returned");
        System.out.print(fetchEncryption());

        System.out.println("\n\nCaesars Cipher. Text provided via method parameters. Result returned");
        System.out.println("To encrypt:" + toEncrypt);
        System.out.print(fetchEncryption(toEncrypt));

        System.out.println("\n\nCaesars Cipher decryption. Text provided via Interface. Result printed");
        printDecryption();

        System.out.println("\n\nCaesars Cipher decryption. Text provided via method parameters. Result printed");
        System.out.println("To Decrypt:" + toDecrypt);
        printDecryption(toDecrypt);

        System.out.println("\n\nCaesars Cipher decryption. Text provided via interface. Result returned");
        System.out.print(fetchDecryption());

        System.out.println("\n\nCaesars Cipher decryption. Text provided via method parameters. Result returned");
        System.out.println("To Decrypt:" + toDecrypt);
        System.out.print(fetchDecryption(toDecrypt));
    }
}
