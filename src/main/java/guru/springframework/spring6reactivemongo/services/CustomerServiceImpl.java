package guru.springframework.spring6reactivemongo.services;

import guru.springframework.spring6reactivemongo.model.CustomerDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Created By dhaval on 2023-07-07
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Mono<CustomerDTO> saveCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public Mono<CustomerDTO> getCustomerById(String customerId) {
        return null;
    }
}
