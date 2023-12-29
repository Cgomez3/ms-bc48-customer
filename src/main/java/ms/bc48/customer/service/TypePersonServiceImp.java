package ms.bc48.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import ms.bc48.customer.config.ConfigException;
import ms.bc48.customer.model.TypePerson;
import ms.bc48.customer.repository.TypePersonRepository;

@Service
public class TypePersonServiceImp implements TypePersonService{

    @Autowired
    private TypePersonRepository typePersonRepository;
    
	@Override
	public Single<TypePerson> save(TypePerson typePerson) {
		// TODO Auto-generated method stub
		return typePersonRepository.findByDescription(typePerson.getDescription())
				.map(t -> {
						throw new ConfigException("the type of person already exists");	
						
				}).cast(TypePerson.class)
				.switchIfEmpty(typePersonRepository.save(typePerson));
	}

	@Override
	public Maybe<TypePerson> findByDescription(String description) {
		return typePersonRepository.findByDescription(description);
	}

}
