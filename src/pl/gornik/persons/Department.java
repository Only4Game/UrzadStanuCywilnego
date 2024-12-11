package pl.gornik.persons;

public enum Department {
    ADMIN("Administrator","Pełny dostęp"),
    STAFF("Pracownik","Ograniczony dostęp"),
    ;
    private final String displayName;
    private final String description;

    Department(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }
}
