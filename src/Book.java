public class Book {
    private Author author;
    private String title;
    private int yearOfPublication;

    public Book(String title, int yearOfPublication, Author author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public Author getAuthor(){
        return author;
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




