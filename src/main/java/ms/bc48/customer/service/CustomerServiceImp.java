package ms.bc48.customer.service;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import ms.bc48.customer.config.ConfigException;
import ms.bc48.customer.model.Customer;
import ms.bc48.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Single<Customer> createCustomer(Customer customer) {
        return customerRepository.findByNumberDocument(String.valueOf(customer.getNumberDocument()))
                .map(c -> {
                    throw  new ConfigException("Customer already exists: " + c.getNumberDocument());
                })
                .cast(Customer.class)
                .switchIfEmpty(customerRepository.save(customer));

    }



    @Override
    public Maybe<Customer> searchByDocumentNumber(String numberDocument) {
        return customerRepository.findByNumberDocument(numberDocument)
        		.switchIfEmpty(Maybe.error(new ConfigException("The client with the number does not exist: " + numberDocument)));
    }
}
