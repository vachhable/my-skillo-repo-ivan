package homeworks.lecture9;

import java.time.LocalDate;

public class Child extends Person {
    public Child(String name, String sex, String religion, String languageSpoken, String nationality, String EGN,
                 LocalDate dateOfBirth, String countryOfResidence) throws InvalidEGNException {
        super(name, sex, religion, languageSpoken, null, nationality, EGN, dateOfBirth, countryOfResidence);
    }

    public void play() {
        System.out.println(getName() + " is playing.");
    }
}
