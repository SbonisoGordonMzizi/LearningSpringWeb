package co.za.gordonmzizi.simpleWebApp.repositories;

import co.za.gordonmzizi.simpleWebApp.domain.Authour;
import org.springframework.data.repository.CrudRepository;

public interface AuthourRepository extends CrudRepository<Authour,Long> {
}
