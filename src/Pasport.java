import java.util.Objects;
import java.util.Set;

public class Pasport {
    private String name;
    private String surname;
    private String patronymic;
    private String birthYear;
    private Set<String> pasportNumbers;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthYear() {
        return birthYear;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<String> getPassportNumbers() {
        return pasportNumbers;
    }

    public Pasport(Set<String> pasportNumber, String name, String surname, String patronymic, String birthYear) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.pasportNumbers = pasportNumber;
    }

    public String print(Set<String> pasportNumber) {
        for (String pasport1 : pasportNumber) {
            if (pasport1.equals(pasportNumber)) {
                return pasport1;
            }
        }
        return null;
    }

    public boolean contains(String s) {
        return pasportNumbers.contains(s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasport pasport = (Pasport) o;
        return Objects.equals(pasportNumbers, pasport.pasportNumbers) && Objects.equals(surname, pasport.surname) && Objects.equals(name, pasport.name) && Objects.equals(patronymic, pasport.patronymic);
    }

         @Override
    public int hashCode(){
    return Objects.hash( pasportNumbers, surname, name,patronymic, birthYear);
}

       @Override
       public String toString() {
           return surname + " " + name + ", дата рождения " + birthYear + ", номер паспорта " + pasportNumbers;
       }

       }
