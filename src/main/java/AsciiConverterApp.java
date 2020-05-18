import stringTools.AsciiConverter;

import static stringTools.AsciiConverter.*;

public class AsciiConverterApp {
    public static void main(String[] args) {
        String testedText = "gstmarszi";

        System.out.println("ASCII coding: String provided via Interface and printed  with | separator.");
        asciiCodePrint();

        System.out.println("\n\nASCII coding: String provided as method parameters and printed with | separator.");
        System.out.println("Text provided: " + testedText);
        asciiCodePrint(testedText);

        System.out.println("\n\nASCII coding: String provided via Interface and returned as String with | separator.");
        System.out.print(asciiCodeReturn());

        System.out.println("\n\nASCII coding: String provided as method parameters and returned as String with | separator.");
        System.out.println("Text provided: " + testedText);
        System.out.print(asciiCodeReturn(testedText));

    }
}
