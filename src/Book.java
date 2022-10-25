public class Book {
    private Object author;
    private String title;
    int yearOfPublication;

    public Book(String title, int yearOfPublication, Object author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public Object getAuthor(){
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




