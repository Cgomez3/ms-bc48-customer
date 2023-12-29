package ms.bc48.customer.repository;

import org.springframework.data.repository.reactive.RxJava3CrudRepository;

import io.reactivex.rxjava3.core.Maybe;
import ms.bc48.customer.model.Customer;

public interface CustomerRepository extends RxJava3CrudRepository<Customer, String>{
	public Maybe<Customer> findByNumberDocument(String numberDocument);
}
