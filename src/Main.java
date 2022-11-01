public class Main {
    public static void main(String[] args) {
        Author author = new Author("Стивен ", "Кинг");
        Book book = new Book("Сияние", 1977, author);
        book.setYearOfPublication(1978);

        Author author1 = new Author("Антуан", " де Сент-Экзюпери");
        Book book1 = new Book("Маленький принц", 1942, author1);

        System.out.println("book = " + book);
        System.out.println("book1 = " + book1);
    }
}