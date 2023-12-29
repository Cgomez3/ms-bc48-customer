package ms.bc48.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("customers")
public class Customer {
	
	@Id
    private String id;
    @NotBlank
    private String name;
    private String lastName;
    @NotBlank
    private String numberDocument;
    @Valid
    @NotNull
    private TypePerson typePerson;
	

}
