package org.example.concretes;

import org.example.abstracts.CustomerCheckService;
import org.example.abstracts.CustomerService;
import org.example.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
