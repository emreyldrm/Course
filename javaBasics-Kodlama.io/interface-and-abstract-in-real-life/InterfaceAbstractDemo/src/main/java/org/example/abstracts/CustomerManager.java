package org.example.abstracts;

import org.example.entities.Customer;

public abstract class CustomerManager implements CustomerService{
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to db " + customer.getFirstName());
    }
}
