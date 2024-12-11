package pl.gornik.persons;

import pl.gornik.ex.IllegalValueException;

import java.util.Random;

public class User extends Person implements PersonFunctions {

    private String id;


    public User(String name, String surename, int age, String pesel, String email, String password, String phoneNumber) {
        super(name, surename, age, pesel, email, password, phoneNumber);
        if(phoneNumber.length() != 9) throw new IllegalValueException("Podaj poprawny numer telefonu składający się z 9 cyfr");

        createId();
    }

    @Override
    public void showInfo() {
        System.out.println("--- Informacje o użytkowniku ---\n" +
                "Imię : " + getName() + "\n" +
                "Nazwisko : " + getSurename() + "\n" +
                "Wiek : " + getAge() + "\n" +
                "Pesel : " + getPesel() + "\n" +
                "--- Kontakt ---\n" +
                "Numer telefonu : " + getPhoneNumber() + "\n" +
                "E-mail : " + getEmail() + "\n --- --- --- --- --- ---");
    }

    @Override
    public void createId() {
        Random random = new Random();
        StringBuilder generatedId = new StringBuilder();

        for (int i = 0; i < 7; i++) {
            generatedId.append(random.nextInt(10));
        }

        this.id = generatedId.toString();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurename() {
        return super.getSurename();
    }

    @Override
    public void setSurename(String surename) {
        super.setSurename(surename);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getPesel() {
        return super.getPesel();
    }

    @Override
    public void setPesel(String pesel) {
        super.setPesel(pesel);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }
}
