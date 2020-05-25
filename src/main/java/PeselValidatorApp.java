import java.time.LocalDate;
import java.time.Period;

import static stringTools.PeselValidator.*;

public class PeselValidatorApp {
    public static void main(String[] args) {
        String pesel2 = "46080246725";
        String pesel = "87061646891";

        System.out.println(getBirthDay(pesel));
        System.out.println(getGender(pesel));

        System.out.println(getBirthDay(pesel2));
        System.out.println(getGender(pesel2));

        LocalDate person1BirthDate = getBirthDay(pesel);
        LocalDate person2BirthDate = getBirthDay(pesel2);

        if (person1BirthDate.equals(person2BirthDate)){
            System.out.println(person1BirthDate + " = " + person2BirthDate);
        }else if (person1BirthDate.isBefore(person2BirthDate)){
            System.out.println(person1BirthDate + " < " + person2BirthDate);
            Period p = Period.between(person1BirthDate, person2BirthDate);
            System.out.println("Diff: " + p.getYears() + " years," + p.getMonths() + " months," + p.getDays() + " days");
        }else {
            System.out.println(person1BirthDate + " > " + person2BirthDate);
            Period p = Period.between(person2BirthDate, person1BirthDate);
            System.out.println("Diff: " + p.getYears() + " years," + p.getMonths() + " months," + p.getDays() + " days");
        }



    }
}
