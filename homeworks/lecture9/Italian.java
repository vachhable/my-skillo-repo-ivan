package homeworks.lecture9;

import java.time.LocalDate;

public class Italian extends Person {
    public Italian(String name, String sex, String religion, String languageSpoken, String job, String nationality,
                   String EGN, LocalDate dateOfBirth, String countryOfResidence) throws InvalidEGNException {
        super(name, sex, religion, languageSpoken, job, nationality, EGN, dateOfBirth, countryOfResidence);
    }

    public void eatPasta() {
        System.out.println(getName() + " is eating pasta.");
    }
}
