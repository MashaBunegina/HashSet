import java.util.Objects;
import java.util.Set;

public class Pasport {
    private String name;
    private String surname;
    private String patronymic;
    private String birthYear;
    private String pasportNumber;

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

    public String getPassportNumber() {
        return pasportNumber;
    }

    public Pasport(String pasportNumber1, String name, String surname, String patronymic, String birthYear) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.pasportNumber = pasportNumber1;
    }



    public boolean contains(String s) {
        return pasportNumber.contains(s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasport pasport = (Pasport) o;
        return Objects.equals(pasportNumber, pasport.pasportNumber) && Objects.equals(surname, pasport.surname) && Objects.equals(name, pasport.name) && Objects.equals(patronymic, pasport.patronymic);
    }

         @Override
    public int hashCode(){
    return Objects.hash( pasportNumber, surname, name,patronymic, birthYear);
}

       @Override
       public String toString() {
           return surname + " " + name + ", дата рождения " + birthYear + ", номер паспорта " + pasportNumber;
       }

       }
