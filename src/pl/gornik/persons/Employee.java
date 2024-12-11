package pl.gornik.persons;

public class Employee extends Person implements PersonFunctions{
    private Enum<Department> role;
    private String specialId;
    private String displayName;

    public Employee(String name, String surename, int age, String pesel, String email, String password, String phoneNumber, Enum<Department> role, String specialId, String displayName) {
        super(name, surename, age, pesel, email, password, phoneNumber);
        this.role = role;
        this.specialId = specialId;
        this.displayName = displayName;

    }



    @Override
    public void showInfo() {
        System.out.println("--- Informacje o prackowniku ---\n" +
                           "Nazwa : " + displayName);

    }

    @Override
    public void createId() {
        //tworzy id :

        // jeśli enum to admin
        // id = np. ADM1234

        // jeśli enum to staff
        //  id = np. STF1234
    }


}
