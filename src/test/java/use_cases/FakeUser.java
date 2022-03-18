package use_cases;

import model.Customer.UserRepository;
import model.Customer.Utilisateur;

import java.util.List;

public class FakeUser implements UserRepository {

   public Utilisateur utilisateur;


    public  FakeUser() {
        utilisateur = new Utilisateur("1L","Karim",22,"43 rue de boulet");

    }

    @Override
    public List<String> getAll() {
        return null;
    }

    @Override
    public Utilisateur findById(String userId) {
        return null;
    }
}
