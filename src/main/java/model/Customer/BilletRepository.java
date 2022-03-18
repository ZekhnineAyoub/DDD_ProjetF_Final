package model.Customer;

import java.util.List;

public interface BilletRepository {
    List<String> getAll();
    Billet findById(String idBillet);
    void save(Billet billet);

}
