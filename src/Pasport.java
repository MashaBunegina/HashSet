public class Pasport {
    private String name;
    private String surname;
    private String patronymic;
    private int birthYear;
    private static int count=0;
    private final int pasportNumber;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Pasport{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthYear=" + birthYear +
                ", pasportId=" + pasportNumber +
                '}';
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


    public int getPasportNumber() {
        return pasportNumber;
    }

    public Pasport(String name, String surname, String patronymic, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        pasportNumber=count++;
    }
}

