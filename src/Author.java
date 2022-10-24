public class Author {
    final String name;
    String surname;
    Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName () {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
