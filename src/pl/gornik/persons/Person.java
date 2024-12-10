package pl.gornik.persons;

import pl.gornik.ex.IllegalNumberException;
import pl.gornik.ex.IllegalValueException;

public class Person {
    private String name;
    private String surename;
    private int age;
    private String pesel;
    private String email;

    public Person(String name, String surename, int age, String pesel, String email) {
        if(name.length()<3) throw new IllegalValueException("Długość imienia nie może być krótsza niż 3");
        if(surename.length()<3) throw new IllegalValueException("Długość nazwiska nie może być krótsza niż 3");
        if(age < 0) throw new IllegalNumberException("Wiek osoby nie może być ujemny");
        if(pesel.length() != 11) throw new IllegalValueException("Długość peselu musi wynosić 11 znaków");
        if (!isValidEmail(email)) throw new IllegalValueException("Email musi składać się z 9 znaków oraz musi zawierać @ i .");

        this.name = name;
        this.surename = surename;
        this.age = age;
        this.pesel = pesel;
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        return email != null
                && email.length() >= 9
                && email.contains("@")
                && email.lastIndexOf(".") > email.indexOf("@");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}