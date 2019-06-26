package pl.www.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.www.shop.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerById(Long id);

    Customer findByUsername(String username);
}
