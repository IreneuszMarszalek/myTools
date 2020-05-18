package interfaceProviders;

import java.util.Scanner;

public class ParametersProvider {
    //
    //    Take input data and returns String
    //
    public static String provideString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //
    //    Take input data with displaying message and returns String
    //
    public static String provideString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
       return scanner.nextLine();
    }
}
