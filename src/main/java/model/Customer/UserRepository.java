package model.Customer;

import java.util.List;

public interface UserRepository {
    List<String> getAll();
    Utilisateur findById(String userId);

}
