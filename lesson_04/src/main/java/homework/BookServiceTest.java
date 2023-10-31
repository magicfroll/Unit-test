package homework;

import book.BookRepository;
import book.BookService;
import book.InMemoryBookRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Test
    void bookServiceFindBookByIdTest() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        bookService.findBookById("1");
        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    void bookServiceFindAllTest() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        bookService.findAllBooks();
        verify(bookRepository, times(1)).findAll();
    }

    @Test
    void inMemoryBookRepositoryTest() {
        BookRepository BookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(BookRepository);
        bookService.findBookById("1");
        verify(BookRepository, times(1)).findById("1");
    }




}
