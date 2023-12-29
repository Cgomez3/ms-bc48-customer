package ms.bc48.customer.service;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import ms.bc48.customer.model.TypePerson;

public interface TypePersonService {
   Single<TypePerson>save(TypePerson typePerson);
   Maybe<TypePerson> findByDescription(String description);
}
