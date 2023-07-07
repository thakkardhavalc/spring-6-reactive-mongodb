package guru.springframework.spring6reactivemongo.repositories;

import guru.springframework.spring6reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created By dhaval on 2023-07-07
 */
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
