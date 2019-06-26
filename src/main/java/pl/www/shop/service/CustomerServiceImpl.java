package pl.www.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.www.shop.model.Customer;
import pl.www.shop.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> getCustomer(Long id) {
        return Optional.ofNullable(customerRepository.findCustomerById(id));
    }

    @Override
    public List<Customer> getAllCustomersList() {
        return customerRepository.findAll();
    }
}
