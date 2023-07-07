package guru.springframework.spring6reactivemongo.mappers;

import guru.springframework.spring6reactivemongo.domain.Beer;
import guru.springframework.spring6reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * Created By dhaval on 2023-07-07
 */
@Mapper
public interface BeerMapper {
    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
