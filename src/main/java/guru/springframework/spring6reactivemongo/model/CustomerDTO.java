package guru.springframework.spring6reactivemongo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created By dhaval on 2023-07-07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {

    private Integer id;

    @NotBlank
    @Size(min = 3, max = 255)
    private String customerName;

    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
