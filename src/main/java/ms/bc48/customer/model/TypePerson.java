package ms.bc48.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("TypePerson")
public class TypePerson {
	@Id
    private String id;
	@NotBlank
	private String codigo;
    @NotBlank
    private String description;
    
}
