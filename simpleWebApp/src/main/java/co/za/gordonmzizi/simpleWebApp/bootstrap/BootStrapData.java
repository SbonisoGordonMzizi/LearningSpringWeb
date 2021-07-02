package co.za.gordonmzizi.simpleWebApp.bootstrap;

import co.za.gordonmzizi.simpleWebApp.domain.Authour;
import co.za.gordonmzizi.simpleWebApp.domain.Book;
import co.za.gordonmzizi.simpleWebApp.domain.Publisher;
import co.za.gordonmzizi.simpleWebApp.repositories.AuthourRepository;
import co.za.gordonmzizi.simpleWebApp.repositories.BookRepository;
import co.za.gordonmzizi.simpleWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthourRepository authourRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthourRepository authourRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authourRepository = authourRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher bookBestPublisher = new Publisher("BookBestPublisher", "123  Wall", "Spring", "East Rand", 7011);
        publisherRepository.save(bookBestPublisher);

        Authour bob = new Authour("Bob", "Evans");
        Book ddd = new Book("Domain Driven Design", "12434323");

        bob.getBooks().add(ddd);
        ddd.getAuthours().add(bob);
        ddd.setPublisher(bookBestPublisher);
        bookBestPublisher.getBooks().add(ddd);


        authourRepository.save(bob);
        bookRepository.save(ddd);
        publisherRepository.save(bookBestPublisher);


        Authour lucky = new Authour("Lucky", "Smith");
        Book java = new Book("Java 8 Core", "452456434");
        lucky.getBooks().add(java);
        java.getAuthours().add(lucky);
        java.setPublisher(bookBestPublisher);
        bookBestPublisher.getBooks().add(java);

        authourRepository.save(lucky);
        bookRepository.save(java);
        publisherRepository.save(bookBestPublisher);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books " + bookRepository.count());
        System.out.println("Number of Authourd " + authourRepository.count());
        System.out.println("Number of Publisher " + publisherRepository.count());
        System.out.println("Publisher published " + bookBestPublisher.getBooks().size());

    }
}
