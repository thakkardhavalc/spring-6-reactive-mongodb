package guru.springframework.spring6reactivemongo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * Created By dhaval on 2023-07-07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class CustomerDTO {

    private String id;

    @NotBlank
    @Size(min = 3, max = 255)
    private String customerName;

    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
