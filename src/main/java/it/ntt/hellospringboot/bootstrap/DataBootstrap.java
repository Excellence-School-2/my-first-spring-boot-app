package it.ntt.hellospringboot.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.ntt.hellospringboot.model.Author;
import it.ntt.hellospringboot.model.Book;
import it.ntt.hellospringboot.repository.AuthorRepository;
import it.ntt.hellospringboot.repository.BookRepository;

@Component
public class DataBootstrap implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    
    public DataBootstrap(AuthorRepository authorRepository, BookRepository bookRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author carlo = new Author("Carlo", "Centofanti");

        Book book1 = new Book("Il mio primo libro", "123-abc");
        book1.setAuthor(carlo);

        authorRepository.save(carlo);
        bookRepository.save(book1);

        Book book2 = new Book("Il mio secondo libro", "321-abc");
        book2.setAuthor(carlo);
        
        bookRepository.save(book2);
        
    }
    
}
