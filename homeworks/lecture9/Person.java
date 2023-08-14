package homeworks.lecture9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private final String name;
    private final String sex;
    private final String religion;
    private final String languageSpoken;
    private String job;
    private String nationality;
    private final String EGN;
    private final LocalDate dateOfBirth;
    private int age;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String languageSpoken, String job, String nationality,
                  String EGN, LocalDate dateOfBirth, String countryOfResidence) throws InvalidEGNException {
        this.name = name;
        this.sex = validateSex(sex);
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.EGN = validateEGN(EGN);
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge(dateOfBirth);
        this.countryOfResidence = countryOfResidence;
    }

    private String validateSex(String sex) {
        if (sex.equalsIgnoreCase("MALE") || sex.equalsIgnoreCase("FEMALE")) {
            return sex.toUpperCase();
        } else {
            System.out.println("Invalid sex: " + sex);
            return "UNKNOWN";
        }
    }

    private String validateEGN(String EGN) throws InvalidEGNException {
        if (EGN.length() != 10) {
            throw new InvalidEGNException("Invalid EGN length. EGN must be 10 digits.");
        }
        return EGN;
    }

    private int calculateAge(LocalDate dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - dateOfBirth.getYear();
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getReligion() {
        return religion;
    }

    public String getLanguageSpoken() {
        return languageSpoken;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getNationality() {
        return nationality;
    }

    public String getEGN() {
        return EGN;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Religion: " + religion);
        System.out.println("Language Spoken: " + languageSpoken);
        System.out.println("Job: " + job);
        System.out.println("Nationality: " + nationality);
        System.out.println("EGN: " + EGN);
        System.out.println("Date of Birth: " + dateOfBirth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Age: " + age);
        System.out.println("Country of Residence: " + countryOfResidence);
    }

    public void sayHello() {
        switch (languageSpoken.toLowerCase()) {
            case "bulgarian":
                System.out.println("Здравей!");
                break;
            case "italian":
                System.out.println("Ciao!");
                break;
            default:
                System.out.println("Hello!");
                break;
        }
    }

    public void celebrateEaster() {
        switch (religion.toLowerCase()) {
            case "orthodox":
                System.out.println("Happy Orthodox Easter!");
                break;
            case "catholic":
                System.out.println("Happy Catholic Easter!");
                break;
            case "islam":
                System.out.println("Easter is not celebrated in Islam.");
                break;
            default:
                System.out.println("Easter celebration depends on the person's religion.");
                break;
        }
    }

    public boolean isAdult() {
        switch (countryOfResidence.toLowerCase()) {
            case "bulgaria":
                return age >= 18;
            case "italy":
                return age >= 18;
            case "usa":
                return age >= 21;
            default:
                return false;
        }
    }

    public boolean canTakeLoan() {
        if (job != null) {
            switch (job.toLowerCase()) {
                case "employed":
                    return true;
                case "self-employed":
                    return true;
                default:
                    return false;
            }
        } else {
            return false;
        }
    }
}