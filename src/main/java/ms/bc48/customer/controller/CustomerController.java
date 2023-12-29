package ms.bc48.customer.controller;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import ms.bc48.customer.model.Customer;
import ms.bc48.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin(value = {"*"})
public class CustomerController {
	
    @Autowired
    private ICustomerService customerService;

    @PostMapping(produces = "application/json")
    public  Single<Customer> create(@RequestBody Customer customer){
        return  customerService.createCustomer(customer);
    }

    @GetMapping("/{numberDocument}")
    public Maybe<Customer> searchCustomer(@PathVariable String numberDocument){
        return customerService.searchByDocumentNumber(numberDocument);
    }

}
