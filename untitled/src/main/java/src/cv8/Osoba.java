package src.cv8;

import java.io.Serializable;

public class Osoba implements Serializable {
    String name, surname;
    int age;

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }

    public Osoba(String name, String surname, int age, Datum dob) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dob = dob;
    }

    Datum dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Datum getDob() {
        return dob;
    }

    public void setDob(Datum dob) {
        this.dob = dob;
    }
}
