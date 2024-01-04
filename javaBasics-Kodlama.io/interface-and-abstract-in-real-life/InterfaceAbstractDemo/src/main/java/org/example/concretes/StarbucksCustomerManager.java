package org.example.concretes;

import org.example.abstracts.CustomerCheckService;
import org.example.abstracts.CustomerManager;
import org.example.entities.Customer;

public class StarbucksCustomerManager extends CustomerManager  {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public void save(Customer customer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(customer)){
            System.out.println("Saved to db " + customer.getFirstName());
        }else {
            System.out.println("Not a valid person");
        }

    }
}
