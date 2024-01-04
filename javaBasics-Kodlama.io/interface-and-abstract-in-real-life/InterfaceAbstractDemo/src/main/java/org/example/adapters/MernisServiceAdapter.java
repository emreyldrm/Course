package org.example.adapters;

import org.example.abstracts.CustomerCheckService;
import org.example.entities.Customer;
import org.example.mernis.LKNKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    LKNKPSPublicSoap lknkpsPublicSoap = new LKNKPSPublicSoap();
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        return lknkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
    }
}
