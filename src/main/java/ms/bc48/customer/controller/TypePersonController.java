package ms.bc48.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.bc48.customer.model.TypePerson;
import ms.bc48.customer.service.TypePersonService;

@RestController
@RequestMapping("/api/type-person")
@CrossOrigin(value = {"*"})
public class TypePersonController {

	@Autowired
	private TypePersonService  personService;
	
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody TypePerson typePerson){
		return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(personService.save(typePerson));
	}
}
