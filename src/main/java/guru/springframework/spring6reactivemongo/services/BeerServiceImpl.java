package guru.springframework.spring6reactivemongo.services;

import guru.springframework.spring6reactivemongo.model.BeerDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Created By dhaval on 2023-07-07
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Mono<BeerDTO> saveBeer(BeerDTO beerDTO) {
        return null;
    }

    @Override
    public Mono<BeerDTO> getById(String beerId) {
        return null;
    }
}
