package pl.www.shop.service;

import pl.www.shop.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Optional<Customer> getCustomer(Long id);

    List<Customer> getAllCustomersList();
}
