package guru.springframework.spring6reactivemongo.services;

import guru.springframework.spring6reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

/**
 * Created By dhaval on 2023-07-07
 */
public interface BeerService {

    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);

    Mono<BeerDTO> getById(String beerId);
}
