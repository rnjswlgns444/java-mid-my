package nested.test.ex1;

import lang.string.immutable.StringImmutable1;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {

        if(bookCount < books.length) { //정상 로직
            books[bookCount++] = new Book(title, author);
        } else { //예외 처리
            System.out.println("도서관 저장 공간이 부족합니다.");

        }
    }


    public void showBooks() {
        System.out.println("==책 목록 출력==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 도서 저자: " + books[i].author);
        }
    }

    private static class Book { //Library의 인스턴스를 써야하면 static이 붙으면 안됨.
        private String title;
        private String author;

        public Book (String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
