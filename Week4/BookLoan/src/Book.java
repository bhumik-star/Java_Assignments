public class Book {
	private String title;
	private String author;
	private String bookCode;
	private boolean loaned;

	public Book(String title, String author, String bookCode) {
		if (title == null || title.trim().isEmpty()) {
			throw new IllegalArgumentException("Title cannot be blank");
		}
		if (author == null || author.trim().isEmpty()) {
			throw new IllegalArgumentException("Author cannot be blank");
		}
		if (bookCode == null || bookCode.trim().isEmpty()) {
			throw new IllegalArgumentException("Book code cannot be blank");
		}

		this.title = title;
		this.author = author;
		this.bookCode = bookCode;
		this.loaned = false;
	}

	public boolean borrowBook() {
		if (loaned) {
			return false;
		}

		loaned = true;
		return true;
	}

	public boolean returnBook() {
		if (!loaned) {
			return false;
		}

		loaned = false;
		return true;
	}

	public boolean isAvailable() {
		return !loaned;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getBookCode() {
		return bookCode;
	}

	@Override
	public String toString() {
		return "Book{title='" + title + "', author='" + author
				+ "', bookCode='" + bookCode + "', available=" + isAvailable() + "}";
	}
}