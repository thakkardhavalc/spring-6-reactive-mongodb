package guru.springframework.spring6reactivemongo.services;

import guru.springframework.spring6reactivemongo.model.CustomerDTO;
import reactor.core.publisher.Mono;

/**
 * Created By dhaval on 2023-07-07
 */
public interface CustomerService {

    Mono<CustomerDTO> saveCustomer(CustomerDTO customerDTO);

    Mono<CustomerDTO> getCustomerById(String customerId);
}
