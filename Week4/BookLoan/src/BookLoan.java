public class BookLoan {
    public static void main(String[] args) {
        Book firstBook = new Book("The Hobbit", "J.R.R. Tolkien", "B001");
        Book secondBook = new Book("1984", "George Orwell", "B002");

        System.out.println(firstBook);
        System.out.println("First borrow: " + firstBook.borrowBook());
        System.out.println("Repeated borrow: " + firstBook.borrowBook());
        System.out.println("Return: " + firstBook.returnBook());
        System.out.println("Return available book: " + firstBook.returnBook());
        System.out.println("First book available: " + firstBook.isAvailable());
        System.out.println("Second book available: " + secondBook.isAvailable());
        System.out.println("Second borrow: " + secondBook.borrowBook());
        System.out.println("First book available after second loan: " + firstBook.isAvailable());
    }
}
