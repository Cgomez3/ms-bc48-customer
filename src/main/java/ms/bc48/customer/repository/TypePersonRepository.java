package ms.bc48.customer.repository;

import org.springframework.data.repository.reactive.RxJava3CrudRepository;

import io.reactivex.rxjava3.core.Maybe;
import ms.bc48.customer.model.TypePerson;

public interface TypePersonRepository extends RxJava3CrudRepository<TypePerson, String>{
     Maybe<TypePerson> findByDescription(String description);
}
