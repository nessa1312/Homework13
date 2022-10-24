public class Book {
    String title;
    int yearOfPublication;

    public Book(String title, int yearOfPublication, String author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}




