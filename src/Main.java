public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Boris", "Akunin");
        Book book1 = new Book("Azazel", author1, 1984);

        Author author2 = new Author("Robert", "Martin");
        Book book2 = new Book("Clean Code", author2, 2010);

        System.out.println(author1 + "\n" + book1);
        System.out.println(author2 + "\n" + book2);

        book1.setPublishingYear(2024);
        System.out.println(author1 + "\n" + book1);

    }
}


