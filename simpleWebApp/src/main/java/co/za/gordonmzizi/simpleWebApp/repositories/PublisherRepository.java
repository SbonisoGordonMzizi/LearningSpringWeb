package co.za.gordonmzizi.simpleWebApp.repositories;

import co.za.gordonmzizi.simpleWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
