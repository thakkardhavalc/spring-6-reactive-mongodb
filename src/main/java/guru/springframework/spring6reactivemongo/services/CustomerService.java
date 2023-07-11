package guru.springframework.spring6reactivemongo.services;

import guru.springframework.spring6reactivemongo.model.CustomerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created By dhaval on 2023-07-07
 */
public interface CustomerService {

    Flux<CustomerDTO> listCustomers();

    Mono<CustomerDTO> getCustomerById(String customerId);

    Mono<CustomerDTO> saveCustomer(CustomerDTO customerDTO);

    Mono<CustomerDTO> saveCustomer(Mono<CustomerDTO> customerDTO);

    Mono<CustomerDTO> updateCustomer(String customerId, CustomerDTO customerDTO);

    Mono<CustomerDTO> patchCustomer(String customerId, CustomerDTO customerDTO);

    Mono<Void> deleteCustomerById(String customerId);

}
