package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Sowmya on 3/16/17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
