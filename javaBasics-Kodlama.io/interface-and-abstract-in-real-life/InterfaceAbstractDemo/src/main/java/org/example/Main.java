package org.example;

import org.example.abstracts.CustomerManager;
import org.example.adapters.MernisServiceAdapter;
import org.example.concretes.NeroCustomerManager;
import org.example.concretes.StarbucksCustomerManager;
import org.example.entities.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Emre","Yıldırım", LocalDate.of(1999,8,22),"12345678911"));
    }
}