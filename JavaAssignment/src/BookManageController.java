import java.util.ArrayList;

public class BookManageController {
    private ArrayList<BookDTO> books;
    private BookManageView view;

    public BookManageController() {
        books = new ArrayList<>();
        view = new BookManageView();
    }

    public void run() {
        while (true) {
            int choice = view.displayMenu();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    displayBooks();
                    break;
                default:
                    System.out.println("옵션을 다시 선택하세요.");
            }
        }
    }

    private void addBook() {
        BookDTO newBook = view.getBookDetails();
        books.add(newBook);
        System.out.println("도서가 추가되었습니다.");
    }

    private void searchBook() {
        String searchQuery = view.getSearchQuery();
        boolean found = false;

        for (BookDTO book : books) {
            if (book.getIsbn().equals(searchQuery) || book.getBookName().equals(searchQuery)) {
                System.out.println("도서 검색 결과: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    private void updateBook() {
        String searchQuery = view.getSearchQuery();
        boolean found = false;

        for (BookDTO book : books) {
            if (book.getIsbn().equals(searchQuery) || book.getBookName().equals(searchQuery)) {
                BookDTO updatedBook = view.getUpdatedBookDetails(book);
                book.setIsbn(updatedBook.getIsbn());
                book.setBookName(updatedBook.getBookName());
                book.setAuthor(updatedBook.getAuthor());
                book.setPublisher(updatedBook.getPublisher());
                book.setPrice(updatedBook.getPrice());

                System.out.println("도서 정보가 성공적으로 수정되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("검색한 도서가 존재하지 않습니다.");
        }
    }

    private void deleteBook() {
        String searchQuery = view.getSearchQuery();
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            BookDTO book = books.get(i);
            if (book.getIsbn().equals(searchQuery) || book.getBookName().equals(searchQuery)) {
                System.out.println("삭제할 도서 정보: " + book);
                books.remove(i);
                System.out.println("도서가 성공적으로 삭제되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("검색한 도서가 존재하지 않습니다.");
        }
    }

    private void displayBooks() {
        view.displayBooks(books);
    }
}

