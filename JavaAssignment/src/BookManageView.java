import java.util.Scanner;
import java.util.ArrayList;

public class BookManageView {
    private Scanner scanner = new Scanner(System.in);

    public int displayMenu() {
        System.out.println("=== 도서관리 시스템 ===");
        System.out.println("1. 도서정보 추가");
        System.out.println("2. 도서 조회");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 도서 목록 출력");
        System.out.print("Menu를 입력하세요 (1~5번): ");
        return scanner.nextInt();
    }

    public BookDTO getBookDetails() {
        System.out.println("새 도서 정보 입력:");
        System.out.print("ISBN: ");
        String isbn = scanner.next();
        scanner.nextLine();  //인터넷에서 찾음, 여러 단어 허용, 이거 없으면 단어 두개이상 못씀

        System.out.print("도서명: ");
        String bookName = scanner.nextLine();

        System.out.print("저자: ");
        String author = scanner.nextLine();

        System.out.print("출판사: ");
        String publisher = scanner.nextLine();

        System.out.print("가격: ");
        int price = scanner.nextInt();

        return new BookDTO(isbn, bookName, author, publisher, price);
    }

    public BookDTO getUpdatedBookDetails(BookDTO book) {//이걸로 초기가 아닌 수정된 정보
        scanner.nextLine();//이거 없으면 새 ISBN 안 들어옴
        
        System.out.println("수정할 도서 정보:");
        System.out.println("현재 ISBN: " + book.getIsbn());
        System.out.print("새 ISBN: ");
        String newIsbn = scanner.nextLine();

        System.out.println("현재 도서명: " + book.getBookName());
        System.out.print("새 도서명: ");
        String newBookName = scanner.nextLine();

        System.out.println("현재 저자: " + book.getAuthor());
        System.out.print("새 저자: ");
        String newAuthor = scanner.nextLine();

        System.out.println("현재 출판사: " + book.getPublisher());
        System.out.print("새 출판사: ");
        String newPublisher = scanner.nextLine();

        System.out.println("현재 가격: ₩" + book.getPrice());
        System.out.print("새 가격: ");
        int newPrice = scanner.nextInt();
        scanner.nextLine();

        return new BookDTO(newIsbn, newBookName, newAuthor, newPublisher, newPrice);
    }


    public String getSearchQuery() {
        System.out.print("검색할 ISBN 또는 도서명을 입력하세요: ");
        return scanner.next();
    }

    public void displayBooks(ArrayList<BookDTO> books) {
        System.out.println("=== 도서 목록 ===");
        for (BookDTO book : books) {
            System.out.println(book);
        }
    }
}
