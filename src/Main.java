public class Main {
    public static void main(String[] args) {
        Book book = new Book("Сияние", 1977, "Стивен Кинг");
        System.out.println("book.title = " + book.title);
        System.out.println("book.yearOfPublication = " + book.yearOfPublication);
        Author author = new Author("Стивен", "Кинг");
        System.out.println("author.name = " + author.name);
        System.out.println("author.surname = " + author.surname);
        book.setYearOfPublication(1978);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());

        Book book1 = new Book("Маленький принц", 1942, "Антуан де Сент-Экзюпери");
        System.out.println("book1.title = " + book1.title);
        System.out.println("book1.yearOfPublication = " + book1.yearOfPublication);
        Author author1 = new Author("Антуан", " де Сент-Экзюпери");
        System.out.println("author1.name = " + author1.name);
        System.out.println("author1.surname = " + author1.surname);
    }
}