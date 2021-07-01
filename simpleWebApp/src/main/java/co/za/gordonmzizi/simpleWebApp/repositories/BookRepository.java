package co.za.gordonmzizi.simpleWebApp.repositories;

import co.za.gordonmzizi.simpleWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
