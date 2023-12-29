package ms.bc48.customer.service;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import ms.bc48.customer.model.Customer;

public interface ICustomerService {
    public Single<Customer> createCustomer(Customer customer);
    public Maybe<Customer> searchByDocumentNumber(String numberDocument);
}
