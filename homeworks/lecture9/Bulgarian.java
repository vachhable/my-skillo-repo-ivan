package homeworks.lecture9;

import java.time.LocalDate;

public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String religion, String languageSpoken, String job, String nationality,
                     String EGN, LocalDate dateOfBirth, String countryOfResidence) throws InvalidEGNException {
        super(name, sex, religion, languageSpoken, job, nationality, EGN, dateOfBirth, countryOfResidence);
    }

    public void danceHoro() {
        System.out.println(getName() + " is dancing horo.");
    }
}
