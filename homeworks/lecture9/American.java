package homeworks.lecture9;

import java.time.LocalDate;

public class American extends Person {
    public American(String name, String sex, String religion, String languageSpoken, String job, String nationality,
                    String EGN, LocalDate dateOfBirth, String countryOfResidence) throws InvalidEGNException {
        super(name, sex, religion, languageSpoken, job, nationality, EGN, dateOfBirth, countryOfResidence);
    }

    public void celebrateFourthOfJuly() {
        System.out.println(getName() + " is celebrating the Fourth of July.");
    }
}
