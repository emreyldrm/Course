package org.example.concretes;

import org.example.abstracts.CustomerCheckService;
import org.example.abstracts.CustomerManager;
import org.example.entities.Customer;

public class NeroCustomerManager extends CustomerManager {
    private CustomerCheckService customerCheckService;

    public NeroCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(customer)){
            System.out.println("Saved to db " + customer.getFirstName());
        }else {
            System.out.println("Not a valid person");
        }
    }
}
