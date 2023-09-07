public class Main {
    public static void main(String[] args) {
        Author auth=new Author("Ivan", "sdhgsd@mail.ru", 'm');
        System.out.println(auth.toString());

        Book book=new Book("Flower", auth, 100.00, 20);
        System.out.print(book.toString());
    }
}