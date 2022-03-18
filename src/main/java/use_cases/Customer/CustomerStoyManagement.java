package use_cases.Customer;

import model.Customer.Panier;

public interface CustomerStoyManagement {

     Panier create(String billetId, String userId);

}
