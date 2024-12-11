package pl.gornik.persons;

import pl.gornik.ex.IllegalNumberException;
import pl.gornik.ex.IllegalValueException;

public class Person {
    private String name;
    private String surename;
    private int age;
    private String pesel;
    private String email;
    private String password;
    private String phoneNumber;

    public Person(String name, String surename, int age, String pesel, String email, String password, String phoneNumber) {
        if(name.length()<3) throw new IllegalValueException("Długość imienia nie może być krótsza niż 3");
        if(surename.length()<3) throw new IllegalValueException("Długość nazwiska nie może być krótsza niż 3");
        if(age < 0) throw new IllegalNumberException("Wiek osoby nie może być ujemny");
        if(pesel.length() != 11) throw new IllegalValueException("Długość peselu musi wynosić 11 znaków");
        if (!isValidEmail(email)) throw new IllegalValueException("Email musi składać się z 9 znaków oraz musi zawierać @ i .");
        if(!isPasswordValid(password)) throw new IllegalValueException("Hasło musi składać się z 8 znaków w tym 1 dużej litery i 1 cyfry");
        if(!isValidPhoneNumber(phoneNumber)) throw new IllegalValueException("Podaj poprawny numer telefonu składający się z 9 cyfr");

        this.name = name;
        this.surename = surename;
        this.age = age;
        this.pesel = pesel;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (hasUppercase && hasDigit) {
                return true;
            }
        }

        return false;
    }

    public boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 9) {
            return false;
        }

        for (char c : phoneNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
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
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}