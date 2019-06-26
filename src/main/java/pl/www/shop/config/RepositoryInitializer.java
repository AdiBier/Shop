package pl.www.shop.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.www.shop.model.Customer;
import pl.www.shop.repository.CustomerRepository;

@Component
public class RepositoryInitializer implements InitializingBean {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        if(customerRepository.findAll().isEmpty() == true)
        {
            try {
                Customer customer1 = new Customer();

                customer1.setUsername("Adrian");
                customer1.setPassword("frytki123");
                customerRepository.save(customer1);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
