package inflearn.thejava.reflection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceTest {

    @Autowired
    BookService bookService;

    @Test
    void di() {
        assertThat(bookService).isNotNull();
        assertThat(bookService.bookRepository).isNotNull();
    }

}