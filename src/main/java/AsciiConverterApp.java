import stringTools.AsciiConverter;

import static stringTools.AsciiConverter.*;

public class AsciiConverterApp {
    public static void main(String[] args) {
        String testedText = "JAVA";
        String testedText2 = "74|65|86|65";

        System.out.println("ASCII coding: String provided via Interface and printed  with | separator.");
        printAscii();

        System.out.println("\n\nASCII coding: String provided as method parameters and printed with | separator.");
        System.out.println("Text provided: " + testedText);
        printAscii(testedText);

        System.out.println("\n\nASCII coding: String provided via Interface and returned as String with | separator.");
        System.out.print(fetchAscii());

        System.out.println("\n\nASCII coding: String provided as method parameters and returned as String with | separator.");
        System.out.println("Text provided: " + testedText);
        System.out.print(fetchAscii(testedText));

        System.out.println("\n\nASCII decoding: ASCII codes provided via Interface. Printed");
        printFromAscii();

        System.out.println("\n\nASCII decoding: ASCII codes provided as method. Printed");
        System.out.println("Text provided: " + testedText2);
        printFromAscii(testedText2);

        System.out.println("\n\nASCII decoding: ASCII codes provided via Interface. Returned as String");
        System.out.print(fetchFromAscii());

        System.out.println("\n\nASCII decoding: ASCII codes provided as method. Returned as String\"");
        System.out.println("Text provided: " + testedText2);
        System.out.print(fetchFromAscii(testedText2));

    }
}
